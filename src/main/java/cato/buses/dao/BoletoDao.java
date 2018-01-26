package cato.buses.dao;

import java.util.Date;
import java.util.List;

import cato.buses.model.Boleto;
import cato.buses.model.Paradas;
import cato.buses.model.Recorrido;

public interface BoletoDao {
	void Guardar(Boleto boleto);
	void actualizar(Boleto boleto);
	Boleto buscarPorId(int id);
	void borrar(Boleto boleto);
	List<Boleto> listaBoleto();
	List<Boleto> asientosDisponiblesPorParadas(Paradas paradaOrigen,Paradas paradaDestino);
	List<Boleto> listaBoletosPorRecorrido(Recorrido recorrido);
	List<Boleto> listaBoletoPorFechas(Date desde, Date hasta, Integer idCiudadOrigen, Integer idCiudadDestino);
}
