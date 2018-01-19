package municipalidad.pto.service;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Chofer;

public interface ChoferService {
	void guardar(Chofer chofer);
	void Actualizar(Chofer chofer);
	void borrar(Chofer chofer);
	Chofer buscarPorId(int id);
	List<Chofer> listaChofer();
	List<SelectItem> comboChofer();
}
