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
@Table(name = "productos_series")
public class ProductoSerie {
    @Id
    @EqualsAndHashCode.Include
    private String serie;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false, foreignKey = @ForeignKey(name = "FK_PRODUCTO_SERIE_PRODUCTO"))
    private Producto producto;

    private String estado;

    private String referencia;
}
