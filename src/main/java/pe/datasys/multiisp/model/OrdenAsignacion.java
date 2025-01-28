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
@Table(name = "ordenes_asignaciones")
public class OrdenAsignacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idOrdenAsignacion;

    @ManyToOne
    @JoinColumn(name = "id_orden", nullable = false, foreignKey = @ForeignKey(name = "FK_ORDEN_ASIGNACION_ORDEN"))
    private Orden orden;
    
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "FK_ORDEN_ASIGNACION_USER"))
    private User user;
    
    private LocalDate fechaAsignacion;

    private LocalDate fechaAtencion;
    
    private String reporte;

    private String estado;

    private Integer activo;
}
