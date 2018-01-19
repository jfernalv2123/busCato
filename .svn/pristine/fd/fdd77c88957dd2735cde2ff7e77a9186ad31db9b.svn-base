package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.ArticuloDao;
import municipalidad.pto.model.Articulos;
import municipalidad.pto.model.User;

@Repository("articuloDao")
public class ArticuloDaoImpl implements ArticuloDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public Articulos findArticuloById(int id) {
		return (Articulos) sessionFactory.getCurrentSession().get(Articulos.class, id);
	}
public Articulos findArticuloByCodigo(String cod){
	String query="FROM Articulos as a where a.codigoAntiguo=:cod";
//	List<Articulos> aux= sessionFactory.getCurrentSession().createQuery(query).list();
	List<Articulos> aux= sessionFactory.getCurrentSession().createQuery(query).setString("cod", cod).list();
	return aux.get(0);

}
	public List<Articulos> listaArticulos() {

		String query="FROM Articulos as a";
		List<Articulos> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<String> nombreaArticuloBynombre(String articulo){
		String query="Select a.articulo FROM Articulos as a where a.articulo like '"+articulo+"%'";
		List<String> aux= sessionFactory.getCurrentSession().createQuery(query).list();
		return aux;
	}
}
