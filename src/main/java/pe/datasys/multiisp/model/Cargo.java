package pe.datasys.multiisp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idCargo;

    @ManyToOne
    @JoinColumn(name = "id_abonado", nullable = false)
    private Abonado abonado;

    @ManyToOne
    @JoinColumn(name = "id_tipo_cargo", nullable = false)
    private TipoCargo tipoCargo;

    @ManyToOne
    @JoinColumn(name = "id_liquidacion")
    private Liquidacion liquidacion;

    private LocalDate fechaEmision;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private LocalDate fechaVencimiento;

    @Column(length = 2, nullable = false)
    private Integer anio;

    // @Column(length = 2, nullable = false)
    private String periodo;

    private Integer tipo;

    @ManyToOne
    @JoinColumn(name = "id_plan")
    private SedePlan sedePlan;

    private String glosa;

    private Integer cantidad;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double precio;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double total;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double pagado;

    private Long idRecibo;

}
