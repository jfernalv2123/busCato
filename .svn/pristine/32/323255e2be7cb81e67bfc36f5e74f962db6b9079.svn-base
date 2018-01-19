package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.AreaDao;
import municipalidad.pto.model.AreaArticulo;

@Repository("areaDao")
public class AreaDaoImpl implements AreaDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public AreaArticulo findAreaById(int id) {
		return (AreaArticulo) sessionFactory.getCurrentSession().get(AreaArticulo.class, id);
	}

	public List<AreaArticulo> listaAreas() {

		String query="FROM AreaArticulo as a";
		List<AreaArticulo> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	
	public List<SelectItem> comboArea(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT a.idArea,a.area FROM AreaArticulo as a";
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
