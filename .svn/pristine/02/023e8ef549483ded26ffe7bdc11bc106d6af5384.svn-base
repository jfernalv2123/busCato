package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.SalidaDao;
import municipalidad.pto.model.Salida;

@Repository("salidaDao")
public class SalidaDaoImpl implements SalidaDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Salida findSalidaById(int id) {
		return (Salida) sessionFactory.getCurrentSession().get(Salida.class, id);
	}

	public List<Salida> listaSalidas() {

		String query="FROM Salida as a";
		List<Salida> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public Integer ultimoIngreso(){
		String query="select max(s.idSalida) FROM Salida as s";
		List<Integer> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux.get(0);
	}
}
