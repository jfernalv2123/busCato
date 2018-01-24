package municipalidad.pto.dao;

import java.util.List;

import municipalidad.pto.model.Boleto;
import municipalidad.pto.model.Paradas;
import municipalidad.pto.model.Recorrido;

public interface BoletoDao {
	void Guardar(Boleto boleto);
	void actualizar(Boleto boleto);
	Boleto buscarPorId(int id);
	void borrar(Boleto boleto);
	List<Boleto> listaBoleto();
	List<Boleto> asientosDisponiblesPorParadas(Paradas paradaOrigen,Paradas paradaDestino);
	List<Boleto> listaBoletosPorRecorrido(Recorrido recorrido);
}
