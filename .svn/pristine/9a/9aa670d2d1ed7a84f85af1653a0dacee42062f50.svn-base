package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.RazonSocialDao;
import municipalidad.pto.model.RazonSocial;

@Repository("razonSocialDao")
public class RazonSocialDaoImpl implements RazonSocialDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public RazonSocial findRazonSocialById(int id) {
		return (RazonSocial) sessionFactory.getCurrentSession().get(RazonSocial.class, id);
	}
	public List<RazonSocial> listaRazonSocial() {

		String query="FROM RazonSocial as a";
		List<RazonSocial> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	
	public List<SelectItem> comboRazonSocial(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT a.idRazonSocial,a.razonSocial FROM RazonSocial as a";
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
