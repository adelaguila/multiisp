package pe.datasys.multiisp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vias")
public class Via {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idVia;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false, foreignKey = @ForeignKey(name = "FK_VIA_SEDE"))
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "id_tipo_via", nullable = false, foreignKey = @ForeignKey(name = "FK_VIA_TIPO_VIA"))
    private TipoVia tipoVia;

    @Column(length = 150, nullable = false)
    private String nombreVia;
}
