package pe.datasys.multiisp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ordenes")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idOrden;

    @ManyToOne
    @JoinColumn(name = "id_abonado", nullable = false, foreignKey = @ForeignKey(name = "FK_ORDEN_ABONADO"))
    private Abonado abonado;

    @Column(length = 150, nullable = false)
    private String detalle;

    @Column(length = 250)
    private String reporte;

    @Column(length = 50, nullable = false)
    private String estado;

    @Column(nullable = false)
    private LocalDate fechaRegistro;

    private LocalDate fechaAsignacion;

    private LocalDate fechaAtencion;

    @ManyToOne
    @JoinColumn(name = "id_tipo_orden", nullable = false, foreignKey = @ForeignKey(name = "FK_ORDEN_TIPO_ORDEN"))
    private TipoOrden tipoOrden;

    @Column(nullable = true)
    private Integer vendedor;

    @ManyToOne
    @JoinColumn(name = "id_sede_plan", foreignKey = @ForeignKey(name = "FK_ORDEN_SEDE_PLAN"))
    private SedePlan sedePlan;

}
