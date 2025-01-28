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
@Table(name = "facturacion_items")
public class FacturacionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id_facturacion_item")
    private Long idFacturacionItem;

    @ManyToOne
    @JoinColumn(name = "id_facturacion", nullable = false, foreignKey = @ForeignKey(name = "FK_FACTURACION_ITEM_FACTURACION"))
    private Facturacion facturacion;

    @Column(nullable = false, length = 500)
    private String glosa;

    private Integer cantidad;

    private double precio;

    private double subtotal;

    private double igv;

    private double total;

    private String referencia;

    @Column(nullable = true)
    private Integer idProducto;

    @Column(nullable = true)
    private String series;
}
