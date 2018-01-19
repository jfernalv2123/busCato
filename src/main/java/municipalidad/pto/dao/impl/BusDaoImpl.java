package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.BusDao;
import municipalidad.pto.model.Bus;
@Repository("busDao")
public class BusDaoImpl implements BusDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(Bus bus){
		sessionFactory.getCurrentSession().persist(bus);
	}
	public void actualizar(Bus bus){
		sessionFactory.getCurrentSession().update(bus);
	}
	public Bus buscarPorId(int id){
		return (Bus) sessionFactory.getCurrentSession().get(Bus.class, id);
	}
	public void borrar(Bus bus){
		sessionFactory.getCurrentSession().delete(bus);
	}
	
	public List<Bus> listabus(){
		String query="FROM Bus as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	
	public List<SelectItem> comboBus(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT b.patente,b.id FROM Bus as b";
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
	public List<SelectItem> comboPisosBus(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT distinct b.pisos,b.pisos FROM Bus as b";
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
	public List<SelectItem> comboWcBus(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT distinct b.wc,b.wc FROM Bus as b";
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

