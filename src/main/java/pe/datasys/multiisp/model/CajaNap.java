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
@Table(name = "cajas_nap")
public class CajaNap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idCajaNap;

    @Column(length = 100, nullable = false)
    private String nombreCajaNap;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false, foreignKey = @ForeignKey(name = "FK_CAJA_NAP_SEDE"))
    private Sede sede;

    @Column(length = 200)
    private String latitud;

    @Column(length = 200)
    private String longitud;

    @Column(length = 1, nullable = false)
    private Integer puertos;
    
    @Column(length = 1, nullable = false)
    private String estado = "A";

}
