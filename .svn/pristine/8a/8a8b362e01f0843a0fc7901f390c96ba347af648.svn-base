package municipalidad.pto.dao.impl;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;
import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.ImagenDao;
import municipalidad.pto.model.Imagen;


@Repository("imagenDao")
public class ImagenDaoImpl implements ImagenDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void persistImagen(Imagen imagen) {
		sessionFactory.getCurrentSession().persist(imagen);
	}

	public Imagen findImagenById(int id) {
		return (Imagen) sessionFactory.getCurrentSession().get(Imagen.class, id);
	}

	public void updateImagen(Imagen imagen) {
		sessionFactory.getCurrentSession().update(imagen);
		
	}

	public void deleteImagen(Imagen imagen) {
		sessionFactory.getCurrentSession().delete(imagen);
		
	}
	public List<SelectItem> comboImagen(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT i.idImagen,i.idImagen FROM Imagen as i where i.idImagen"
		+ " Not In (Select ingr.idImagen from Ingresos as ingr)";
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

	public StreamedContent imageById(Integer id) {
		FacesContext context = FacesContext.getCurrentInstance();

		if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			return new DefaultStreamedContent();
		} else {
			Imagen img = new Imagen();
			img = findImagenById(id);
			return new DefaultStreamedContent(new ByteArrayInputStream(img.getImagen()),"image/png");
		}

	}

}
