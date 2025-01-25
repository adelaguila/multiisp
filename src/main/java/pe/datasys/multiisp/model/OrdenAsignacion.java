package pe.datasys.multiisp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

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
    @JoinColumn(name = "id_orden", nullable = false)
    private Orden orden;
    
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;
    
    private LocalDate fechaAsignacion;

    private LocalDate fechaAtencion;
    
    private String reporte;

    private String estado;

    private Integer activo;
}
