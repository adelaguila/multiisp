package pe.datasys.multiisp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
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
    @JoinColumn(name = "id_abonado", nullable = false)
    private Abonado abonado;

    @ManyToOne
    @JoinColumn(name = "id_cargo")
    private Cargo cargo;

    @Column(nullable = false)
    private LocalDate fechaPago;

    private String referencia;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", nullable = false)
    private TipoPago tipoPago;

    @ManyToOne
    @JoinColumn(name = "numero_cuenta", nullable = true)
    private CuentaBancaria cuentaBancaria;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double total;

    @ManyToOne
    @JoinColumn(name = "id_user_registro", nullable = false)
    private User userRegistro;

    @ManyToOne
    @JoinColumn(name = "id_user_cobrador")
    private User userCobrador;

    private Long idRecibo;

    private Long idFacturacion;

    @Column(nullable = false)
    private Integer idCierre = 0;

}
