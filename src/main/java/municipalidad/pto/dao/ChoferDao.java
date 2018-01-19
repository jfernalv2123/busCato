package municipalidad.pto.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Chofer;

public interface ChoferDao {
	void Guardar(Chofer chofer);
	void actualizar(Chofer chofer);
	Chofer buscarPorId(int id);
	void borrar(Chofer chofer);
	List<Chofer> listaChofer();
	List<SelectItem> comboChofer();
}
