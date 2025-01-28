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
@Table(name = "almacen_movimientos")
public class AlmacenMovimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idAlmacenIngreso;

    @ManyToOne
    @JoinColumn(name = "id_almacen", nullable = false, foreignKey = @ForeignKey(name = "FK_ALMACEN_MOVIMIENTO_ALMACEN"))
    private Almacen almacen;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_tipo_movimiento_almacen", nullable = false, foreignKey = @ForeignKey(name = "FK_ALMACEN_MOVIMIENTO_TIPO_MOVIMIENTO_ALMACEN"))
    private TipoMovimientoAlmacen tipoMovimientoAlmacen;

    @Column(nullable = false, length = 15)
    private String documento;

    private String referencia;

    @ManyToOne
    @JoinColumn(name = "id_cliente_proveedor", nullable = true, foreignKey = @ForeignKey(name = "FK_ALMACEN_MOVIMIENTO_CLIENTE_PROVEEDOR"))
    private ClienteProveedor clienteProveedor;

    @ManyToOne
    @JoinColumn(name = "id_user_tecnico", nullable = true, foreignKey = @ForeignKey(name = "FK_ALMACEN_MOVIMIENTO_USER"))
    private User userTecnico;

}

