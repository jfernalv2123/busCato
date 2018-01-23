package municipalidad.pto.service;

import java.util.List;

import municipalidad.pto.model.Boleto;
import municipalidad.pto.model.Paradas;

public interface BoletoService {
	void guardar(Boleto boleto);
	void Actualizar(Boleto boleto);
	void borrar(Boleto boleto);
	Boleto buscarPorId(int id);
	List<Boleto> listaBoleto();
	List<Boleto> asientosDisponiblesPorParadas(Paradas paradaOrigen,Paradas paradaDestino);
}
