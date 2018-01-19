package municipalidad.pto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.FotoArticuloDao;
import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.model.FotoArticulo;
import municipalidad.pto.service.FotoArticuloService;

@Service("fotoArticuloService")
public class FotoArticuloServiceImpl implements FotoArticuloService{

	@Autowired
	GenericDao genericDao;
	@Autowired
	FotoArticuloDao fotoArticuloDao;
	
	@Transactional
	public void persistFono(FotoArticulo fotoArticulo) {
		genericDao.Guardar(fotoArticulo);
		
	}
	@Transactional
	public FotoArticulo findFotoArticuloById(int id) {
	
		return fotoArticuloDao.findFotoArticuloById(id);
	}
	@Transactional
	public void updateFotoArticulo(FotoArticulo fotoArticulo) {
		genericDao.update(fotoArticulo);
		
	}
	@Transactional
	public void deleteFotoArticulo(FotoArticulo fotoArticulo) {
		genericDao.delete(fotoArticulo);
		
	}
	@Transactional
	public List<FotoArticulo> listaFotosArticulos(){
		return fotoArticuloDao.listaFotosArticulos();
	}
	@Transactional
	public List<FotoArticulo> listaFotosByArticulo(int articulo){
		return fotoArticuloDao.listaFotosByArticulo(articulo);
	}
}
