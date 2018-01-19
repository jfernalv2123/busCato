package municipalidad.pto.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Bus;

public interface BusDao {
	void Guardar(Bus bus);
	void actualizar(Bus bus);
	Bus buscarPorId(int id);
	void borrar(Bus bus);
	List<Bus> listabus();
	List<SelectItem> comboBus();
	List<SelectItem> comboPisosBus();
	List<SelectItem> comboWcBus();
}
