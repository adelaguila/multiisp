package pe.datasys.multiisp.repo;

import org.springframework.data.jpa.repository.Query;
import pe.datasys.multiisp.model.Ubigeo;

import java.util.List;
public interface IUbigeoRepo extends IGenericRepo<Ubigeo, String> {
    @Query("FROM Ubigeo u WHERE u.distrito LIKE %:term% ORDER BY u.distrito, u.provincia")
    List<Ubigeo> autocomplete(String term);
}
