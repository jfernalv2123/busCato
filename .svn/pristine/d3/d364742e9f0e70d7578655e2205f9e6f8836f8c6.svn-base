package municipalidad.pto.service;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Proveedor;
import municipalidad.pto.objetos.ProveedoresTabla;

public interface ProveedorService {
	void persistProveedor(Proveedor proveedor);
	Proveedor findProveedorById(int id);
	void updateProveedor(Proveedor proveedor);
	void deleteProveedor(Proveedor proveedor);
	List<Proveedor> listaProveedor();
	List<SelectItem> comboProveedor();
	Proveedor proveedorBynombre(String proveedor);
	List<ProveedoresTabla> listaProveedores();
	List<String> nombreProveedorByName(String proveedor);
	List<Proveedor> buscadorTablaProveedores(Integer id, String proveedor, boolean credito, String articulo,
			Integer categoria, String fono, String mail, String direccion, String ciudad, String region);
}
