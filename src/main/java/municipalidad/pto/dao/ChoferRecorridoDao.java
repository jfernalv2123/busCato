package municipalidad.pto.dao;

import java.util.List;

import municipalidad.pto.model.ChoferRecorrido;

public interface ChoferRecorridoDao {
	void Guardar(ChoferRecorrido choferRecorrido);
	void actualizar(ChoferRecorrido choferRecorrido);
	ChoferRecorrido buscarPorId(int id);
	void borrar(ChoferRecorrido choferRecorrido);
	List<ChoferRecorrido> listaChoferRecorrido();
}
