package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.TipoDao;
import municipalidad.pto.model.AreaArticulo;
import municipalidad.pto.model.Tipo;

@Repository("tipoDao")
public class TipoDaoImpl implements TipoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Tipo findTipoById(int id) {
		return (Tipo) sessionFactory.getCurrentSession().get(Tipo.class, id);
	}

	public List<Tipo> listaTipos() {

		String query="FROM Tipo as t";
		List<Tipo> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<SelectItem> comboTipo(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT a.idTipo,a.tipo FROM Tipo as a";
		Iterator iter = sessionFactory.getCurrentSession().createQuery(query).iterate();
		while (iter.hasNext()) {
			SelectItem item=new SelectItem();
			Object[] combo = (Object[]) iter.next();
			item.setLabel(String.valueOf(combo[1]));
			item.setValue(String.valueOf(combo[0]));
			
			aux.add(item);
		}
		return aux;
	}
}
