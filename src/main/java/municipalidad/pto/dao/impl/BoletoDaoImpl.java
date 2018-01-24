package municipalidad.pto.dao.impl;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.BoletoDao;
import municipalidad.pto.model.Boleto;
import municipalidad.pto.model.Paradas;
import municipalidad.pto.model.Recorrido;


@Repository("boletoDao")
public class BoletoDaoImpl implements BoletoDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void Guardar(Boleto boleto){
		sessionFactory.getCurrentSession().persist(boleto);
	}
	public void actualizar(Boleto boleto){
		sessionFactory.getCurrentSession().update(boleto);
	}
	public Boleto buscarPorId(int id){
		return (Boleto) sessionFactory.getCurrentSession().get(Boleto.class, id);
	}
	public void borrar(Boleto boleto){
		sessionFactory.getCurrentSession().delete(boleto);
	}
	
	public List<Boleto> listaBoleto(){
		String query="FROM Boleto as b";
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	public List<SelectItem> comboAsientosDisponibles(Integer idParadaDetino,Integer idParadaOrigen){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT b.asiento,b.asiento FROM Boleto as b where b.paradaOrigen.id="+idParadaDetino;
		query +=" and b.parada="+idParadaOrigen;
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
	public List<Boleto> asientosDisponiblesPorParadas(Paradas paradaOrigen,Paradas paradaDestino){
		String query="FROM Boleto as b where b.parada.id="+paradaDestino.getId()+" and b.paradaOrigen.id="+paradaOrigen.getId();
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	public List<Boleto> listaBoletosPorRecorrido(Recorrido recorrido){
		String query="FROM Boleto as b where b.parada.recorrido.id="+recorrido.getId();
		return sessionFactory.getCurrentSession().createQuery(query).list();
	}
	
}
