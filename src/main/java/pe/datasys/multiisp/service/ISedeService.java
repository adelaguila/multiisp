package pe.datasys.multiisp.service;

import pe.datasys.multiisp.model.Sede;

public interface ISedeService extends ICRUD<Sede, Integer> {
    Sede findByRuc(String ruc);
}
