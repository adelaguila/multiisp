package pe.datasys.multiisp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cuentas_bancarias")
public class CuentaBancaria {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 20, nullable = false)
    private String numeroCuenta;

    @Column(length = 50)
    private String cci;

    @Column(length = 150, nullable = false)
    private String nombreCuentaBancaria;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false)
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "id_banco", nullable = false)
    private Banco banco;

    @ManyToOne
    @JoinColumn(name = "moneda", nullable = false)
    private Moneda moneda;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double saldoInicial;

}
