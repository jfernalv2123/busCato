package cato.buses.service;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Recorrido;

public interface RecorridosService {
	void guardar(Recorrido recorrido);
	void Actualizar(Recorrido recorrido);
	void borrar(Recorrido recorrido);
	Recorrido buscarPorId(int id);
	List<Recorrido> listaRecorrido();
	List<SelectItem> comboRecorrido();
	List<Recorrido> recorridoPorFecha(Date desde,Date hasta);
	List<SelectItem> comboRecorridoPorFecha(Date desde,Date hasta);
}
