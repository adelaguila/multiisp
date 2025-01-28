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
@Table(name = "cargos_pagos")
public class CargoPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idCargoPago;

    @ManyToOne
    @JoinColumn(name = "id_cargo", nullable = false, foreignKey = @ForeignKey(name = "FK_CARGO_PAGO_CARGO"))
    private Cargo cargo;

    @ManyToOne
    @JoinColumn(name = "id_pago", nullable = false, foreignKey = @ForeignKey(name = "FK_CARGO_PAGO_PAGO"))
    private Pago pago;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double pagado;

}
