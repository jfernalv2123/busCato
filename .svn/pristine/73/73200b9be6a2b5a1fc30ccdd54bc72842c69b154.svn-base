package municipalidad.pto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.DireccionProveedorDao;
import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.model.DireccionProveedor;
import municipalidad.pto.model.Mail;
import municipalidad.pto.service.DireccionProveedorService;

@Service("direccionProveedorService")
public class DireccionProveedorServiceImpl implements DireccionProveedorService {

	@Autowired
	GenericDao genericDao;
	@Autowired
	DireccionProveedorDao direccionProveedorDao;
	
	@Transactional
	public void persistDireccionProveedor(DireccionProveedor direccionProveedor) {
		genericDao.Guardar(direccionProveedor);
		
	}
	@Transactional
	public DireccionProveedor findDireccionProveedorById(int id) {
	
		return direccionProveedorDao.findDireccionProveedorById(id);
	}
	@Transactional
	public void updateDireccionProveedor(DireccionProveedor direccionProveedor) {
		genericDao.update(direccionProveedor);
		
	}
	@Transactional
	public void deleteDireccionProveedor(DireccionProveedor direccionProveedor) {
		genericDao.delete(direccionProveedor);
		
	}
	@Transactional
	public List<DireccionProveedor> listaDireccionProveedor() {
		return direccionProveedorDao.listaDireccionProveedor();
	}
	@Transactional
	public List<DireccionProveedor> listaDireccionProveedorByProveedor(Integer proveedor){
		return direccionProveedorDao.listaDireccionProveedorByProveedor(proveedor);
	}
	@Transactional
	public List<String> listDireccionProveedorByDireccion(String direccion){
		return direccionProveedorDao.listDireccionProveedorByDireccion(direccion);
	}
}
