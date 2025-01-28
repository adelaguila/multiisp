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
public class UbigeoDTO {
    @EqualsAndHashCode.Include
    @NotNull
    @NotEmpty
    @Size(min = 6, max = 6, message = "{codigoUbigeo.size}")
    private String codigo;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 150, message = "{departamento.size}")
    private String departamento;
    
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 150, message = "{provincia.size}")
    private String provincia;
    
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 150, message = "{distrito.size}")
    private String distrito;
    
    @NotEmpty
    @Size(max = 150, message = "{capital.size}")
    private String capital;
}
