package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.CiudadDao;
import municipalidad.pto.model.Ciudad;
@Repository("ciudadDao")
public class CiudadDaoImpl implements CiudadDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(Ciudad ciudad){
		sessionFactory.getCurrentSession().persist(ciudad);
	}
	public void actualizar(Ciudad ciudad){
		sessionFactory.getCurrentSession().update(ciudad);
	}
	public Ciudad buscarPorId(int id){
		return (Ciudad) sessionFactory.getCurrentSession().get(Ciudad.class, id);
	}
	public void borrar(Ciudad ciudad){
		sessionFactory.getCurrentSession().delete(ciudad);
	}
	
	public List<Ciudad> listaCiudad(){
		String query="FROM Ciudad as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	
	public List<SelectItem> comboCiudad(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT c.ciudad,c.id FROM Ciudad as c";
		Iterator iter = sessionFactory.getCurrentSession().createQuery(query).iterate();
		while (iter.hasNext()) {
			SelectItem item=new SelectItem();
			Object[] combo = (Object[]) iter.next();
			item.setLabel(String.valueOf(combo[0]));
			item.setValue(String.valueOf(combo[1]));
			
			aux.add(item);
		}
		return aux;
	}
}
