package pe.datasys.multiisp.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "abonados")
public class Abonado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idAbonado;

    @ManyToOne
    @JoinColumn(name = "id_cliente_proveedor", nullable = false)
    private ClienteProveedor clienteProveedor;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false)
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "id_sector", nullable = false)
    private Sector sector;

    @ManyToOne
    @JoinColumn(name = "id_via", nullable = false)
    private Via via;

    @Column(nullable = false, length = 50)
    private String numero;

    @Column(nullable = true, length = 200)
    private String referencia;

    @Column(nullable = false, length = 150)
    private String suministro;

    @ManyToOne
    @JoinColumn(name = "id_caja_nap", nullable = false)
    private CajaNap cajaNap;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = false)
    private SedePlan sedePlan;

    // @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaRegistro;

    // @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaActivacion;

    // @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaUltimaLiquidacion;

    @Column(nullable = true)
    private Float latitud;

    @Column(nullable = true)
    private Float longitud;

    @Column(nullable = true)
    private Integer idUsuarioRegistro;

    @Column(nullable = true)
    private Integer vendedor;

    @Column(nullable = true)
    private Integer idUsuarioModificacion;    

    @Column(nullable = true)
    private String foto;    

    @Column(length = 20)
    private String estado;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double deuda;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double saldoFavor;
    
    @PrePersist
    public void prePersisten() {
        this.fechaRegistro = LocalDate.now();
        this.estado = "REGISTRADO";
        this.deuda = 0;
        this.saldoFavor = 0;
    }

}

