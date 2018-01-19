package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.UbicacionDao;
import municipalidad.pto.model.Ubicacion;


@Repository("ubicacionDao")
public class UbicacionDaoImpl implements UbicacionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	

	public Ubicacion findUbicacionById(int id) {
		return (Ubicacion) sessionFactory.getCurrentSession().get(Ubicacion.class, id);
	}


	public List<Ubicacion> listaUbicacion() {

		String query="FROM Ubicacion as u";
		List<Ubicacion> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	
	public List<SelectItem> comboUbicacion(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT u.idUbicacion,u.ubicacion FROM Ubicacion as u";
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
