package municipalidad.pto.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Ciudad;

public interface CiudadDao {
	void Guardar(Ciudad ciudad);
	void actualizar(Ciudad ciudad);
	Ciudad buscarPorId(int id);
	List<Ciudad> listaCiudad();
	List<SelectItem> comboCiudad();
	void borrar(Ciudad ciudad);
}
