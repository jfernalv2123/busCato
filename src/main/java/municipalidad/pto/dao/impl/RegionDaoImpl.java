package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.RegionDao;
import municipalidad.pto.model.RegionChile;

@Repository("regionDao")
public class RegionDaoImpl implements RegionDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(RegionChile region){
		sessionFactory.getCurrentSession().persist(region);
	}
	public void actualizar(RegionChile region){
		sessionFactory.getCurrentSession().update(region);
	}
	public RegionChile buscarPorId(int id){
		return (RegionChile) sessionFactory.getCurrentSession().get(RegionChile.class, id);
	}
	public void borrar(RegionChile region){
		sessionFactory.getCurrentSession().delete(region);
	}
	
	public List<RegionChile> listaRegion(){
		String query="FROM RegionChile as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	
	public List<SelectItem> comboRegion(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT c.region,c.id FROM RegionChile as c";
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
