package pe.datasys.multiisp.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SedeDTO {
    @EqualsAndHashCode.Include
    private Integer idSede;

    @NotNull
    @NotEmpty
    @Size(min = 11, max = 11)
    private String ruc;
    
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 150)
    private String nombreSede;

    private String nombreComercial;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 150)
    private String direccionComercial;

    private String direccionFiscal;

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
    private String ubigeo;
    private double pigv;
    private Integer mesCorte;
    private String tipoComprobanteDefecto;

}
