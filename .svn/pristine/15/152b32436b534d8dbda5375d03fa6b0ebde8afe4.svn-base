package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.DevolucionDao;
import municipalidad.pto.model.Devolucion;

@Repository("devolucionDao")
public class DevolucionDaoImpl implements DevolucionDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Devolucion findDevolucionById(int id) {
		return (Devolucion) sessionFactory.getCurrentSession().get(Devolucion.class, id);
	}

	public List<Devolucion> listaDevolucion() {

		String query="FROM Devolucion";
		List<Devolucion> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<Devolucion> listaDevolucionBySalida(int id){
		String query="FROM Devolucion as d where d.salida.idSalida="+id;
		List<Devolucion> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux;
	}
	public Long salidaDevolucion(int id,boolean perdida){
		String query="select sum(d.cantidad) FROM Devolucion as d where d.articulo.idArticulos="+id;
		query+=" and d.perdida is "+perdida;
		List<Long> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux.get(0);
	}
	public Long salidaDevolucionBySalida(int id,boolean perdida){
		String query="select sum(d.cantidad) FROM Devolucion as d where d.salida.idSalida="+id;
		query+=" and d.perdida is "+perdida;
		List<Long> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux.get(0);
	}
	public Long salidaDevolucionBySalidaAndArticulo(int idSalida,int idArticulo,boolean perdida){
		String query="select sum(d.cantidad) FROM Devolucion as d where d.salida.idSalida="+idSalida+" and d.articulo.idArticulos="+idArticulo;
		query+=" and d.perdida is "+perdida;
		List<Long> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux.get(0);
	}
	
}
