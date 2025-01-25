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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tipos_ingresos_alamacenes")
public class TipoIngresoAlmacen {
    @Id
    @EqualsAndHashCode.Include
    private Integer idTipoIngresoAlmacen;

    @Column(length = 150, nullable = false)
    private String nombreTipoIngresoAlmacen;
}
