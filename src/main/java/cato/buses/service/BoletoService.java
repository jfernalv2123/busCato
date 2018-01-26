package cato.buses.service;

import java.util.Date;
import java.util.List;

import cato.buses.model.Boleto;
import cato.buses.model.Paradas;
import cato.buses.model.Recorrido;

public interface BoletoService {
	void guardar(Boleto boleto);
	void Actualizar(Boleto boleto);
	void borrar(Boleto boleto);
	Boleto buscarPorId(int id);
	List<Boleto> listaBoleto();
	List<Boleto> asientosDisponiblesPorParadas(Paradas paradaOrigen,Paradas paradaDestino);
	Integer asientosVendidos(Recorrido recorrido);
	Integer totalVentasRecorrido(Recorrido recorrido);
	List<Boleto> listaBoletosPorRecorrido(Recorrido recorrido);
	List<Boleto> listaBoletoPorFechas(Date desde, Date hasta, Integer idCiudadOrigen, Integer idCiudadDestino);
	Integer ventasPorFecha(Date desde, Date hasta, Integer idCiudadOrigen, Integer idCiudadDestino);
}
