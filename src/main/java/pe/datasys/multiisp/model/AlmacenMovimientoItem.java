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
@Table(name = "almacen_ingresos_items")
public class AlmacenMovimientoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idAlmacenIngresoItem;

    @ManyToOne
    @JoinColumn(name = "id_almacen_ingreso", nullable = false)
    private AlmacenMovimiento almacenIngreso;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    private Integer cantidad;

    private double precioUnitario;

    @Column(length = 600)
    private String series;

}
