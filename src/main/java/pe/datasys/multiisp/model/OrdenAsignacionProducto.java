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
@Table(name = "ordenes_asignaciones_productos")
public class OrdenAsignacionProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idOrdenAsignacionProducto;

    @ManyToOne
    @JoinColumn(name = "id_orden_asignacion", nullable = false, foreignKey = @ForeignKey(name = "FK_ORDEN_ASIGNACION_PRODUCTO_ORDEN_ASIGNACION"))
    private OrdenAsignacion ordenAsignacion;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false, foreignKey = @ForeignKey(name = "FK_ORDEN_ASIGNACION_PRODUCTO_PRODUCTO"))
    private Producto producto;


    @ManyToOne
    @JoinColumn(name = "id_producto_serie", foreignKey = @ForeignKey(name = "FK_ORDEN_ASIGNACION_PRODUCTO_PRODUCTO_SERIE"))
    private ProductoSerie productoSerie;

    private Integer cantidad;

    private String estado;
}
