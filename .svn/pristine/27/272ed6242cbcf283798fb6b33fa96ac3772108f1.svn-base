package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.RelIngresoArticuloDao;
import municipalidad.pto.model.RelIngresoArticulo;

@Repository("relIngresoArticuloDao")
public class RelIngresoArticuloDaoImpl implements RelIngresoArticuloDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public RelIngresoArticulo findRelIngresoArticuloById(int id) {
		return (RelIngresoArticulo) sessionFactory.getCurrentSession().get(RelIngresoArticulo.class, id);
	}

	public List<RelIngresoArticulo> listaRelIngresoArticulo() {

		String query="FROM RelIngresoArticulo";
		List<RelIngresoArticulo> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<RelIngresoArticulo> listaRelIngresoArticuloByIngreso(int id){
		String query="FROM RelIngresoArticulo as r where r.ingreso.idIngreso="+id;
		List<RelIngresoArticulo> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux;
	}
	public Long cantidadIngresoArticulo(int id,boolean inventariable){
		String query="select sum(r.catidad) FROM RelIngresoArticulo as r where r.articulo.idArticulos="+id;
		query+=" and r.ingreso.inventariable is "+inventariable;
		List<Long> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux.get(0);
	}

}
