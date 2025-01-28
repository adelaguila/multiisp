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
@Table(name = "comprobantes")
public class Comprobante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idComprobante;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false, foreignKey = @ForeignKey(name = "FK_COMPROBANTE_SEDE"))
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "id_sunat_tipo_documento", nullable = false, foreignKey = @ForeignKey(name = "FK_COMPROBANTE_SUNAT_TIPO_DOCUMENTO"))
    private SunatTipoDocumento sunatTipoDocumento;

    @Column(length = 4, nullable = false, unique = true)
    private String serie;

    @Column()
    private Integer correlativo;

}
