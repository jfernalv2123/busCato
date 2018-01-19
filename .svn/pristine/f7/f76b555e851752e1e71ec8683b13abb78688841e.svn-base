package municipalidad.pto.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Proveedor;

public interface ProveedorDao {

	Proveedor findProveedorById(int id);
	List<Proveedor> listaProveedor();
	List<SelectItem> comboProveedor();
	Proveedor proveedorBynombre(String proveedor);
	List<String> nombreProveedorByName(String proveedor);
	List<Proveedor> buscadorTablaProveedores(Integer id, String proveedor, boolean credito, String articulo,
			Integer categoria, String fono, String mail, String direccion, String ciudad, String region);
}
