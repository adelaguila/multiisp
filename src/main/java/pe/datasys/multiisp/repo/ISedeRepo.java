package pe.datasys.multiisp.repo;

import pe.datasys.multiisp.model.Sede;



public interface ISedeRepo extends IGenericRepo<Sede, Integer> {
    Sede findByRuc(String ruc);
}
