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
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idPago;

    @ManyToOne
    @JoinColumn(name = "id_abonado", nullable = false, foreignKey = @ForeignKey(name = "FK_PAGO_ABONADO"))
    private Abonado abonado;

    @ManyToOne
    @JoinColumn(name = "id_cargo", foreignKey = @ForeignKey(name = "FK_PAGO_CARGO"))
    private Cargo cargo;

    @Column(nullable = false)
    private LocalDate fechaPago;

    private String referencia;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", nullable = false, foreignKey = @ForeignKey(name = "FK_PAGO_TIPO_PAGO"))
    private TipoPago tipoPago;

    @ManyToOne
    @JoinColumn(name = "numero_cuenta", nullable = true, foreignKey = @ForeignKey(name = "FK_PAGO_CUENTA_BANCARIA"))
    private CuentaBancaria cuentaBancaria;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_user_registro", nullable = false, foreignKey = @ForeignKey(name = "FK_PAGO_USER_REGISTRO"))
    private User userRegistro;

    @ManyToOne
    @JoinColumn(name = "id_user_cobrador", foreignKey = @ForeignKey(name = "FK_PAGO_USER_COBRADOR"))
    private User userCobrador;

    private Long idRecibo;

    private Long idFacturacion;

    @Column(nullable = false)
    private Integer idCierre = 0;

}
