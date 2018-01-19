package municipalidad.pto.service;

import java.util.List;

import municipalidad.pto.model.Boleto;

public interface BoletoService {
	void guardar(Boleto boleto);
	void Actualizar(Boleto boleto);
	void borrar(Boleto boleto);
	Boleto buscarPorId(int id);
	List<Boleto> listaBoleto();
}
