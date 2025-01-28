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
@Table(name = "liquidaciones_pre_pagos")
public class LiquidacionPrePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idLiquidacionPrePago;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false, foreignKey = @ForeignKey(name = "FK_LIQUIDACION_PRE_PAGO_USER"))
    private User cobrador;

    BigDecimal totalGeneral;
    BigDecimal totalEfectivo;
    BigDecimal totalTransferencia;
}
