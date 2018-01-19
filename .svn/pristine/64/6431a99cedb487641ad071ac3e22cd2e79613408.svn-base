package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.IngresoDao;
import municipalidad.pto.model.Ingreso;

@Repository("ingresoDao")
public class IngresoDaoImpl implements IngresoDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Ingreso findIngresoById(int id) {
		return (Ingreso) sessionFactory.getCurrentSession().get(Ingreso.class, id);
	}

	public List<Ingreso> listaIngresos() {

		String query="FROM Ingreso as a";
		List<Ingreso> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public Integer ingresosByProveedor(int proveedor){
		String query="select sum(i.idIngreso) FROM Ingreso as i where i.proveedor.idProveedor="+proveedor;
		List<Integer> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux.get(0);
	}
	public Integer ultimoIngreso(){
		String query="select max(i.idIngreso) FROM Ingreso as i";
		List<Integer> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux.get(0);
	}
	
}
