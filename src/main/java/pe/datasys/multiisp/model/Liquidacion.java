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
@Table(name = "liquidaciones")
public class Liquidacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idLiquidacion;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false, foreignKey = @ForeignKey(name = "FK_LIQUIDACION_SEDE"))
    private Sede sede;

    private LocalDate fechaEmision;

    private LocalDate fechaCierre;

    private LocalDate fechaVencimiento;

    private LocalDate fechaCorte;

    private Integer periodo;

    private Integer anio;
}
