package cato.buses.service;

import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Bus;

public interface BusService {
	void guardar(Bus bus);
	void Actualizar(Bus bus);
	void borrar(Bus bus);
	Bus buscarPorId(int id);
	List<Bus> listaBus();
	List<SelectItem> comboBus();
	List<SelectItem> comboWcBus();
	List<SelectItem> comboPisosBus();
}
