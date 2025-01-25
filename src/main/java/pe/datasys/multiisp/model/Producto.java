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
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idProducto;

    @Column(length = 150, nullable = false)
    private String nombreProducto;

    @Column(length = 50, nullable = false)
    private String unidadMedida;

    private Integer stock;

    private Integer controlSerie;

    private Integer controlDevolucion;

    private String imagen;

}
