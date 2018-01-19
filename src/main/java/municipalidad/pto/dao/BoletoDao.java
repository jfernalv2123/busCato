package municipalidad.pto.dao;

import java.util.List;

import municipalidad.pto.model.Boleto;

public interface BoletoDao {
	void Guardar(Boleto boleto);
	void actualizar(Boleto boleto);
	Boleto buscarPorId(int id);
	void borrar(Boleto boleto);
	List<Boleto> listaBoleto();
}
