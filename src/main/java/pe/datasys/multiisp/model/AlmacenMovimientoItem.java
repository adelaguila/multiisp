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
@Table(name = "almacen_movimientos_items")
public class AlmacenMovimientoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idAlmacenIngresoItem;

    @ManyToOne
    @JoinColumn(name = "id_almacen_movimiento", nullable = false, foreignKey = @ForeignKey(name = "FK_ALMACEN_MOVIMIENTO_ITEM_ALMACEN_MOVIMIENTO"))
    private AlmacenMovimiento almacenMovimiento;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false, foreignKey = @ForeignKey(name = "FK_ALMACEN_MOVIMIENTO_ITEM_PRODUCTO"))
    private Producto producto;

    private Integer cantidad;

    private double precioUnitario;

    @Column(length = 600)
    private String series;

}
