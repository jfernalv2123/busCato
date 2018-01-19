package municipalidad.pto.service;

import java.util.List;

import municipalidad.pto.model.ChoferRecorrido;

public interface ChoferRecorridoService {
	void guadar(ChoferRecorrido choferRecorrido);
	void Actualizar(ChoferRecorrido choferRecorrido);
	void borrar(ChoferRecorrido choferRecorrido);
	ChoferRecorrido buscarPorId(int id);
	List<ChoferRecorrido> listaChoferRecorrido();
}
