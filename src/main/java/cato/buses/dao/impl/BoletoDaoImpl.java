package cato.buses.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cato.buses.dao.BoletoDao;
import cato.buses.model.Boleto;
import cato.buses.model.Paradas;
import cato.buses.model.Recorrido;

@Repository("boletoDao")
public class BoletoDaoImpl implements BoletoDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void Guardar(Boleto boleto) {
		sessionFactory.getCurrentSession().persist(boleto);
	}

	public void actualizar(Boleto boleto) {
		sessionFactory.getCurrentSession().update(boleto);
	}

	public Boleto buscarPorId(int id) {
		return (Boleto) sessionFactory.getCurrentSession().get(Boleto.class, id);
	}

	public void borrar(Boleto boleto) {
		sessionFactory.getCurrentSession().delete(boleto);
	}

	public List<Boleto> listaBoleto() {
		String query = "FROM Boleto as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}

	public List<SelectItem> comboAsientosDisponibles(Integer idParadaDetino, Integer idParadaOrigen) {
		List<SelectItem> aux = new ArrayList<SelectItem>();

		String query = "SELECT b.asiento,b.asiento FROM Boleto as b where b.paradaOrigen.id=" + idParadaDetino;
		query += " and b.parada=" + idParadaOrigen;
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

	public List<Boleto> asientosDisponiblesPorParadas(Paradas paradaOrigen, Paradas paradaDestino) {
		String query = "FROM Boleto as b where b.parada.id=" + paradaDestino.getId() + " and b.paradaOrigen.id="
				+ paradaOrigen.getId();
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}

	public List<Boleto> listaBoletosPorRecorrido(Recorrido recorrido) {
		String query = "FROM Boleto as b where b.parada.recorrido.id=" + recorrido.getId();
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}

	public List<Boleto> listaBoletoPorFechas(Date desde, Date hasta, Integer idCiudadOrigen, Integer idCiudadDestino) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		if(idCiudadOrigen==null){
			idCiudadOrigen=0;
		}
		if(idCiudadDestino==null){
			idCiudadDestino=0;
		}
		String query = "FROM Boleto as b where b.parada.llegada BETWEEN '" + formato.format(desde) + "' and '"
				+ formato.format(hasta) + "'";
		if (idCiudadOrigen != 0  && idCiudadDestino != 0 ) {
			query += " and b.paradaOrigen.terminal.ciudad.id=" + idCiudadOrigen + " and b.parada.terminal.ciudad.id="
					+ idCiudadDestino;
		} else {
			if (idCiudadOrigen != 0 ) {

				query += " and b.paradaOrigen.terminal.ciudad.id=" + idCiudadOrigen;
			} else {
				if (idCiudadDestino != 0) {
					query += " and b.parada.terminal.ciudad.id=" + idCiudadDestino;
				}
				
			}
			
		}

		return sessionFactory.getCurrentSession().createQuery(query).list();
	}

}
