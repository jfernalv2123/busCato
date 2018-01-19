package municipalidad.pto.dao.impl;

import java.io.IOException;
import java.io.InputStream;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.model.Categoria;

@Repository("genericDao")
public class GenericDaoImpl implements GenericDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public byte[] convertirTobyteArray(InputStream is) throws IOException {
		byte[] bytes = null;
		if (is != null) {
			bytes = new byte[is.available()];
			is.read(bytes);
		}
		return bytes;
	}
	
	public void Guardar(Object objeto) {
		sessionFactory.getCurrentSession().persist(objeto);
	}

	public void update(Object objeto) {
		sessionFactory.getCurrentSession().update(objeto);
		
	}

	public void delete(Object objeto) {
		sessionFactory.getCurrentSession().delete(objeto);
		
	}
}
