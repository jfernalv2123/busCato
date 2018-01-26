package cato.buses.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cato.buses.dao.ChoferDao;
import cato.buses.model.Chofer;
@Repository("choferDao")
public class ChoferDaoImpl implements ChoferDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(Chofer chofer){
		sessionFactory.getCurrentSession().persist(chofer);
	}
	public void actualizar(Chofer chofer){
		sessionFactory.getCurrentSession().update(chofer);
	}
	public Chofer buscarPorId(int id){
		return (Chofer) sessionFactory.getCurrentSession().get(Chofer.class, id);
	}
	public void borrar(Chofer chofer){
		sessionFactory.getCurrentSession().delete(chofer);
	}
	
	public List<Chofer> listaChofer(){
		String query="FROM Chofer as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	
	public List<SelectItem> comboChofer(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT c.rut,c.id FROM Chofer as c";
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
