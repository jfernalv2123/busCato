package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.primefaces.model.StreamedContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.ImagenDao;
import municipalidad.pto.model.Imagen;
import municipalidad.pto.service.ImagenService;

@Service("imagenService")
public class ImagenServiceImpl implements ImagenService{
	@Autowired
	ImagenDao imagenDao;

	@Transactional
	public void persistImagen(Imagen imagen) {
		imagenDao.persistImagen(imagen);
		
	}
	@Transactional
	public Imagen findImagenById(int id) {
	    return imagenDao.findImagenById(id);
	}
	@Transactional
	public void updateImagen(Imagen imagen) {
		imagenDao.updateImagen(imagen);
		
	}
	@Transactional
	public void deleteImagen(Imagen imagen) {
		imagenDao.deleteImagen(imagen);
		
	}
	@Transactional
	public List<SelectItem> comboImagen(){
		return imagenDao.comboImagen();
	}
	@Transactional
	public StreamedContent imageById(Integer id){
		return imagenDao.imageById(id);
	}
}
