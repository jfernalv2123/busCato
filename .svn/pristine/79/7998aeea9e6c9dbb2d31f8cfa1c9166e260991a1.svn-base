package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.DireccionProveedorDao;
import municipalidad.pto.model.DireccionProveedor;
import municipalidad.pto.model.Mail;

@Repository("direccionProveedorDao")
public class DireccionProveedorDaoImpl implements DireccionProveedorDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public DireccionProveedor findDireccionProveedorById(int id) {
		return (DireccionProveedor) sessionFactory.getCurrentSession().get(DireccionProveedor.class, id);
	}

	public List<DireccionProveedor> listaDireccionProveedor() {

		String query="FROM DireccionProveedor as dp";
		List<DireccionProveedor> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<DireccionProveedor> listaDireccionProveedorByProveedor(Integer proveedor) {

		String query="FROM DireccionProveedor as dp where dp.proveedor.idProveedor="+proveedor;
		List<DireccionProveedor> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<String> listDireccionProveedorByDireccion(String direccion){
		String query="Select dp.direccion FROM DireccionProveedor as dp where dp.direccion like '"+direccion+"%'";
		List<String> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux;
	}
}
