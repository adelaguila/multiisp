package pe.datasys.multiisp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sedes")
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idSede;

    @Column(length = 11, nullable = false)
    private String ruc;

    @Column(nullable = false)
    private String nombreSede;

    @Column(nullable = false)
    private String nombreComercial;

    @Column(nullable = false)
    private String direccionComercial;

    @Column(nullable = false)
    private String direccionFiscal;

    @Column(length = 10, nullable = false)
    private String codigoDomicilioFiscal;

    private String telefono;

    private String telefonoCentral;

    private String telefonoAtencionCliente;

    private String telefonoReclamos;

    private String correo;

    private String pse;

    private String tokenPse;

    private String urlPse;

    private String urlPseBuscar;

    private String bannerAvisoCobranza;

    private String logo;

    @Column(length = 6, nullable = false)
    private String ubigeo;

    private double pigv;

    private Integer mesCorte;

    private String tipoComprobanteDefecto;

}
