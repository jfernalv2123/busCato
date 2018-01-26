package cato.buses.dao;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Paradas;

public interface ParadasDao {
	void Guardar(Paradas paradas);
	void actualizar(Paradas paradas);
	Paradas buscarPorId(int id);
	void borrar(Paradas paradas);
	List<Paradas> listaParadas();
	List<SelectItem> comboParadas();
	List<SelectItem> comboParadaPorFechaCiudad(Integer idCiudad, Date fecha);
	Long numeroParada(Integer idRecorrido);
	SelectItem ComboParadasCiudadNumero(Integer idRecorrido, Integer parada);
	List<Paradas> paradasPorRecorrido(Integer idRecorrido);
	List<SelectItem> comboParadasPorRecorrido(Integer idRecorrido);
	List<Paradas> listaParadasPorFechaCiudad(Integer idCiudad,Date fechaDesde,Date fechaHasta);
	Paradas paradaPorCiudadRecorrido(Integer idCiudad,Integer idRecorido);
	List<Paradas> listaComboParadaPorFechaCiudad(Integer idCiudad, Date fecha);
	Paradas paradaCiudadNumero(Integer idRecorrido, Integer parada);
}
