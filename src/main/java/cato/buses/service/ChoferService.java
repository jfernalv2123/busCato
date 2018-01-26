package cato.buses.service;

import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Chofer;

public interface ChoferService {
	void guardar(Chofer chofer);
	void Actualizar(Chofer chofer);
	void borrar(Chofer chofer);
	Chofer buscarPorId(int id);
	List<Chofer> listaChofer();
	List<SelectItem> comboChofer();
}
