package pe.datasys.multiisp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sunat_tipos_notas_debitos")
public class SunatTipoNotaDebito {
    @Id
    @EqualsAndHashCode.Include
    @Column(length = 2, nullable = false)
    private String idSunatTipoNotaDebito;

    @Column(length = 150, nullable = false)
    private String nombreSunatTipoNotaDebito;

}
