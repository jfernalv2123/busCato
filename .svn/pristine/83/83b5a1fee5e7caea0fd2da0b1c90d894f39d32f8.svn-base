package municipalidad.pto.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.FotoArticuloDao;
import municipalidad.pto.model.AreaArticulo;
import municipalidad.pto.model.FotoArticulo;

@Repository("fotoArticuloDao")
public class FotoArticuloDaoImpl implements FotoArticuloDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<FotoArticulo> listaFotosByArticulo(Integer articulo) {

		String query = "FROM FotoArticulo as f where f.articulo.idArticulos=" + articulo;
		List<FotoArticulo> aux = sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	
	public List<FotoArticulo>  listaFotosArticulos(){
		String query = "FROM FotoArticulo";
		List<FotoArticulo> aux = sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public FotoArticulo findFotoArticuloById(int id) {
		return (FotoArticulo) sessionFactory.getCurrentSession().get(FotoArticulo.class, id);
	}
}
