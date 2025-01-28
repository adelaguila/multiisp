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
@Table(name = "sedes_planes")
public class SedePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idSedePlan;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false, foreignKey = @ForeignKey(name = "FK_SEDE_PLAN_SEDE"))
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_SEDE_PLAN_PLAN"))
    private Plan plan;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double precioDia;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double precioMes;

}
