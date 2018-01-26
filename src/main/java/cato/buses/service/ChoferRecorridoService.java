package cato.buses.service;

import java.util.List;

import cato.buses.model.ChoferRecorrido;

public interface ChoferRecorridoService {
	void guadar(ChoferRecorrido choferRecorrido);
	void Actualizar(ChoferRecorrido choferRecorrido);
	void borrar(ChoferRecorrido choferRecorrido);
	ChoferRecorrido buscarPorId(int id);
	List<ChoferRecorrido> listaChoferRecorrido();
}
