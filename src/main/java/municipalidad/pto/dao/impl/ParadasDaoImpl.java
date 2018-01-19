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

import municipalidad.pto.dao.ParadasDao;
import municipalidad.pto.model.Paradas;

@Repository("paradasDao")
public class ParadasDaoImpl implements ParadasDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void Guardar(Paradas paradas) {
		sessionFactory.getCurrentSession().persist(paradas);
	}

	public void actualizar(Paradas paradas) {
		sessionFactory.getCurrentSession().update(paradas);
	}

	public Paradas buscarPorId(int id) {
		return (Paradas) sessionFactory.getCurrentSession().get(Paradas.class, id);
	}

	public void borrar(Paradas paradas) {
		sessionFactory.getCurrentSession().delete(paradas);
	}

	public List<Paradas> listaParadas() {
		String query = "FROM Paradas as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}

	public List<SelectItem> comboParadas() {
		List<SelectItem> aux = new ArrayList<SelectItem>();

		String query = "SELECT p.terminal.ciudad.ciudad,p.id FROM Paradas as p";
		Iterator iter = sessionFactory.getCurrentSession().createQuery(query).iterate();
		while (iter.hasNext()) {
			SelectItem item = new SelectItem();
			Object[] combo = (Object[]) iter.next();
			item.setLabel(String.valueOf(combo[0]));
			item.setValue(String.valueOf(combo[1]));

			aux.add(item);
		}
		return aux;
	}

	public List<SelectItem> comboParadaPorFechaCiudad(Integer idCiudad, Date fecha) {
		List<SelectItem> aux = new ArrayList<SelectItem>();
		Date ahora = new Date();
		SimpleDateFormat desde = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

		String query = "SELECT concat(p.terminal.ciudad.ciudad,' ',p.llegada ),p.id FROM Paradas as p";
		query += " where p.llegada BETWEEN '" + desde.format(ahora) + "' and '" + desde.format(fecha) + "'";
		query += " and p.terminal.ciudad.id=" + idCiudad;
		Iterator iter = sessionFactory.getCurrentSession().createQuery(query).iterate();
		while (iter.hasNext()) {
			SelectItem item = new SelectItem();
			Object[] combo = (Object[]) iter.next();
			item.setLabel(String.valueOf(combo[0]));
			item.setValue(String.valueOf(combo[1]));

			aux.add(item);
		}
		return aux;
	}

	public Long numeroParada(Integer idRecorrido) {
		String query = "SELECT count(p.parada) FROM Paradas as p where p.recorrido.id=" + idRecorrido;
		Long numero = (Long) sessionFactory.getCurrentSession().createQuery(query).list().get(0);
		if (numero != null) {
			return numero;
		} else {
			return 0L;
		}
	}

	public SelectItem ComboParadasCiudadNumero(Integer idRecorrido, Integer parada) {
		

		String query = "SELECT concat(p.terminal.ciudad.ciudad,' ',p.llegada),p.id FROM Paradas as p where p.recorrido.id=" + idRecorrido
				+ " and p.parada=" + parada;
		Iterator iter = sessionFactory.getCurrentSession().createQuery(query).iterate();
		SelectItem item = new SelectItem();
		while (iter.hasNext()) {
			
			Object[] combo = (Object[]) iter.next();
			item.setLabel(String.valueOf(combo[0]));
			item.setValue(String.valueOf(combo[1]));

			
		}
		return item;
	}

	public List<Paradas> paradasPorRecorrido(Integer idRecorrido) {
		String query = "FROM Paradas as p where p.recorrido.id=" + idRecorrido;
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	public List<SelectItem> comboParadasPorRecorrido(Integer idRecorrido){
		List<SelectItem> aux = new ArrayList<SelectItem>();
		String query = "SELECT concat(p.terminal.ciudad.ciudad,' salida:',p.llegada ),p.id FROM Paradas as p where p.recorrido.id="+idRecorrido;
		Iterator iter = sessionFactory.getCurrentSession().createQuery(query).iterate();
		while (iter.hasNext()) {
			SelectItem item = new SelectItem();
			Object[] combo = (Object[]) iter.next();
			item.setLabel(String.valueOf(combo[0]));
			item.setValue(String.valueOf(combo[1]));

			aux.add(item);
		}
		return aux;
	}
	public List<Paradas> listaParadasPorFechaCiudad(Integer idCiudad,Date fechaDesde,Date fechaHasta){
//		SELECT * FROM buses.paradas as p,buses.terminal as t where p.fk_terminal=t.id_terminal 
//				and t.fk_ciudad=8 and p.llegada BETWEEN NOW() and "2018-01-21 02:00:00";
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String query = "FROM Paradas as p where p.terminal.ciudad.id=" + idCiudad;
		query += " and p.llegada >='"+formato.format(fechaDesde)+"' and p.llegada <='"+formato.format(fechaHasta)+"'";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	public Paradas paradaPorCiudadRecorrido(Integer idCiudad,Integer idRecorido){
		String query = "FROM Paradas as p where p.terminal.ciudad.id=" + idCiudad+" and p.recorrido.id="+idRecorido;
		
		return (Paradas)sessionFactory.getCurrentSession().createQuery(query).list().get(0);
	}
}
