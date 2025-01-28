package pe.datasys.multiisp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "facturacion")
public class Facturacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long idFacturacion;

    @ManyToOne
    @JoinColumn(name = "id_sede", nullable = false, foreignKey = @ForeignKey(name = "FK_FACTURACION_SEDE"))
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "id_cliente_proveedor", nullable = false, foreignKey = @ForeignKey(name = "FK_FACTURACION_CLIENTE_PROVEEDOR"))
    private ClienteProveedor clienteProveedor;

    private LocalDate fecha;

    @Column(nullable = false, length = 2)
    private String tipoDocumento;

    @Column(nullable = false, length = 4)
    private String serie;

    @Column(nullable = false)
    private Integer numero;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double pigv;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double subtotal;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double igv;

    @Column(nullable = false, columnDefinition = "decimal(6, 2)")
    private double total;

    private LocalDate fechaPago;

    private Integer directo;

    @Column(nullable = true)
    private String referencia;

    @Column(nullable = true)
    private String ordenCompra;

    @Column(nullable = true)
    private String linkXml;    

    @Column(nullable = true)
    private String linkPdf;    

    @Column(nullable = true)
    private String linkCdr;
    
    @Column(nullable = true)
    private String externalId;    

    @Column(nullable = true)
    private String documentoAfectado;    

    @Column(nullable = true, length = 2)
    private String notaCodigo;    

    @Column(nullable = true)
    private String notaMotivo;
    
    @Column(nullable = true)
    private String hash;    

    @Column(nullable = true)
    private Long idPago;    

    @Column(nullable = true)
    private String tipoPago;    

    private LocalDate fechaVencimiento;

    private String tipoMoneda; 
    
    @Column(length = 500)
    private String respuestaCdr;
    
    private Long idTerceroDireccion;

    private Long idAbonado;
    
    @Column(length = 20)
    private String estado;

    private String externalIdResumen;

    private String ticket;

    @Column(nullable = true)
    private Integer idCierre;

    @OneToMany(mappedBy = "facturacion", cascade = CascadeType.ALL)
    private List<FacturacionItem> items;

}

