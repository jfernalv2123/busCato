package cato.buses.service;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Paradas;

public interface ParadasService {
	void guardar(Paradas ciudad);
	void Actualizar(Paradas ciudad);
	void borrar(Paradas ciudad);
	Paradas buscarPorId(int id);
	List<Paradas> listaParadas();
	List<SelectItem> comboParadas();
	List<SelectItem> comboParadaPorFechaCiudad(Integer idCiudad, Date fecha);
	Long numeroParada(Integer idRecorrido);
	SelectItem ComboParadasCiudadNumero(Integer idRecorrido, Integer parada);
	List<SelectItem> comboParadasPorRecorrido(Integer idRecorrido);
	List<Paradas> listaParadasPorFechaCiudad(Integer idCiudad,Date fechaDesde,Date fechaHasta);
	Paradas paradaPorCiudadRecorrido(Integer idCiudad,Integer idRecorido);
	List<Paradas> listaComboParadaPorFechaCiudad(Integer idCiudad, Date fecha);
	Paradas paradaCiudadNumero(Integer idRecorrido, Integer parada);
}
