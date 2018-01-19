package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.RelInformeArticuloDao;
import municipalidad.pto.model.RelInformeArticulo;
import municipalidad.pto.model.RelIngresoArticulo;
@Repository("relInformeArticuloDao")
public class RelInformeArticuloDaoImpl implements RelInformeArticuloDao{
	@Autowired
	private SessionFactory sessionFactory;

	public RelInformeArticulo findRelInformeArticuloById(int id) {
		return (RelInformeArticulo) sessionFactory.getCurrentSession().get(RelInformeArticulo.class, id);
	}

	public List<RelInformeArticulo> listaRelIngresoArticulo() {

		String query="FROM RelInformeArticulo";
		List<RelInformeArticulo> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<RelInformeArticulo> listaRelInformeArticuloByInforme(int id){
		String query="FROM RelInformeArticulo as r where r.informe.idInforme="+id;
		List<RelInformeArticulo> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux;
	}
}
