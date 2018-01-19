package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.TerminalDao;
import municipalidad.pto.model.Terminal;
@Repository("terminalDao")
public class TerminalDaoImpl implements TerminalDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(Terminal region){
		sessionFactory.getCurrentSession().persist(region);
	}
	public void actualizar(Terminal region){
		sessionFactory.getCurrentSession().update(region);
	}
	public Terminal buscarPorId(int id){
		return (Terminal) sessionFactory.getCurrentSession().get(Terminal.class, id);
	}
	public void borrar(Terminal region){
		sessionFactory.getCurrentSession().delete(region);
	}
	
	public List<Terminal> listaTerminal(){
		String query="FROM Terminal as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	
	public List<SelectItem> comboTerminal(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT c.terminal,c.id FROM Terminal as c";
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
	public List<SelectItem> comboAndenesTerminal(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT distinct t.andenes,t.andenes FROM Terminal as t";
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
