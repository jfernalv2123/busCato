package cato.buses.service;

import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Ciudad;

public interface CiudadService {
	void guardar(Ciudad ciudad);
	void Actualizar(Ciudad ciudad);
	void borrar(Ciudad ciudad);
	Ciudad buscarPorId(int id);
	List<Ciudad> listaCiudad();
	List<SelectItem> comboCiudad();
}
