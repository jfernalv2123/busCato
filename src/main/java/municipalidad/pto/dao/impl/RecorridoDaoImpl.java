package municipalidad.pto.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.RecorridoDao;
import municipalidad.pto.model.Recorrido;
@Repository("recorridoDao")
public class RecorridoDaoImpl implements RecorridoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(Recorrido recorrido){
		sessionFactory.getCurrentSession().persist(recorrido);
	}
	public void actualizar(Recorrido recorrido){
		sessionFactory.getCurrentSession().update(recorrido);
	}
	public Recorrido buscarPorId(int id){
		return (Recorrido) sessionFactory.getCurrentSession().get(Recorrido.class, id);
	}
	public void borrar(Recorrido recorrido){
		sessionFactory.getCurrentSession().delete(recorrido);
	}
	
	public List<Recorrido> listaRecorrido(){
		String query="FROM Recorrido as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	
	public List<SelectItem> comboRecorrido(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		Date ahora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String query="SELECT concat(r.origen.ciudad.ciudad, '-', r.destino.ciudad.ciudad,' ',r.bus.patente),r.id FROM Recorrido as r where r.fechaLlegada >='"+formato.format(ahora)+"'";
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
	public List<Recorrido> recorridoPorFecha(Date desde,Date hasta){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String query="FROM Recorrido as r where r.fechaSalida BETWEEN '"+format.format(desde)+"' and '"+format.format(hasta)+"' and r.fechaLlegada BETWEEN r.fechaLlegada <='"+format.format(desde)+"'";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	} 
	public List<SelectItem> comboRecorridoPorFecha(Date desde,Date hasta){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		List<SelectItem> aux=new ArrayList<SelectItem>();
		String query="SELECT concat(r.origen.ciudad.ciudad, '-', r.destino.ciudad.ciudad),r.id FROM Recorrido as r where r.fechaSalida BETWEEN '"+format.format(desde)+"' and '"+format.format(hasta)+"' ";
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
