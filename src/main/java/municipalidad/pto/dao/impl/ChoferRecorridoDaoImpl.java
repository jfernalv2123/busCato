package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.ChoferRecorridoDao;
import municipalidad.pto.model.ChoferRecorrido;
@Repository("choferRecorridoDao")
public class ChoferRecorridoDaoImpl implements ChoferRecorridoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(ChoferRecorrido choferRecorrido){
		sessionFactory.getCurrentSession().persist(choferRecorrido);
	}
	public void actualizar(ChoferRecorrido choferRecorrido){
		sessionFactory.getCurrentSession().update(choferRecorrido);
	}
	public ChoferRecorrido buscarPorId(int id){
		return (ChoferRecorrido) sessionFactory.getCurrentSession().get(ChoferRecorrido.class, id);
	}
	public void borrar(ChoferRecorrido choferRecorrido){
		sessionFactory.getCurrentSession().delete(choferRecorrido);
	}
	
	public List<ChoferRecorrido> listaChoferRecorrido(){
		String query="FROM ChoferRecorrido as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
}
