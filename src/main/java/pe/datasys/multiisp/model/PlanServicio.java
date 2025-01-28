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
@Table(name = "planes_servicios")
public class PlanServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPlanServicio;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = false, foreignKey = @ForeignKey(name = "FK_PLAN_SERVICIO_PLAN"))
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "id_servicio", nullable = false, foreignKey = @ForeignKey(name = "FK_PLAN_SERVICIO_SERVICIO"))
    private Servicio servicio;

}
