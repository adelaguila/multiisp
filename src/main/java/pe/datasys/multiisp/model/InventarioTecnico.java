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
@Table(name = "inventario_tecnico")
public class InventarioTecnico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idInventarioTecnico;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "FK_INVENTARIO_TECNICO_USER"))
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false, foreignKey = @ForeignKey(name = "FK_INVENTARIO_TECNICO_PRODUCTO"))
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_producto_serie", nullable = true, foreignKey = @ForeignKey(name = "FK_INVENTARIO_TECNICO_PRODUCTO_SERIE"))
    private ProductoSerie productoSerie;

    private LocalDate fechaIngreso;

    private Integer stock;

    private String estado;


}
