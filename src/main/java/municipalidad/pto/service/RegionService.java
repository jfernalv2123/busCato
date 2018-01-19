package municipalidad.pto.service;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.RegionChile;

public interface RegionService {
	void guardar(RegionChile recorrido);
	void Actualizar(RegionChile recorrido);
	void borrar(RegionChile recorrido);
	RegionChile buscarPorId(int id);
	List<RegionChile> listaRegion();
	List<SelectItem> comboRegion();
}
