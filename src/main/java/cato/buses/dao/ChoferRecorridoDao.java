package cato.buses.dao;

import java.util.List;

import cato.buses.model.ChoferRecorrido;

public interface ChoferRecorridoDao {
	void Guardar(ChoferRecorrido choferRecorrido);
	void actualizar(ChoferRecorrido choferRecorrido);
	ChoferRecorrido buscarPorId(int id);
	void borrar(ChoferRecorrido choferRecorrido);
	List<ChoferRecorrido> listaChoferRecorrido();
}
