package municipalidad.pto.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.RegionChile;

public interface RegionDao {
	void Guardar(RegionChile region);
	void actualizar(RegionChile region);
	RegionChile buscarPorId(int id);
	void borrar(RegionChile region);
	List<RegionChile> listaRegion();
	List<SelectItem> comboRegion();
}
