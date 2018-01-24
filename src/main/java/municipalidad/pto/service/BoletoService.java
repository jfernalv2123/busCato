package municipalidad.pto.service;

import java.util.List;

import municipalidad.pto.model.Boleto;
import municipalidad.pto.model.Paradas;
import municipalidad.pto.model.Recorrido;

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
}
