package municipalidad.pto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.dao.RelIngresoArticuloDao;
import municipalidad.pto.model.RelIngresoArticulo;
import municipalidad.pto.service.RelIngresoArticuloService;

@Service("relIngresoArticuloService")
public class RelIngresoArticuloServiceImpl implements RelIngresoArticuloService{

	@Autowired
	GenericDao genericDao;
	@Autowired
	RelIngresoArticuloDao relIngresoArticuloDao;
	
	@Transactional
	public void persistRelIngresoArticulo(RelIngresoArticulo relIngresoArticulo) {
		genericDao.Guardar(relIngresoArticulo);;
		
	}
	@Transactional
	public RelIngresoArticulo findRelIngresoArticuloById(int id) {
	
		return relIngresoArticuloDao.findRelIngresoArticuloById(id);
	}
	@Transactional
	public void updateRelIngresoArticulo(RelIngresoArticulo relIngresoArticulo) {
		genericDao.update(relIngresoArticulo);
		
	}
	@Transactional
	public void deleteRelIngresoArticulo(RelIngresoArticulo relIngresoArticulo) {
		genericDao.delete(relIngresoArticulo);
		
	}
	@Transactional
	public List<RelIngresoArticulo> listaRelIngresoArticulo() {
		return relIngresoArticuloDao.listaRelIngresoArticulo();
	}
	@Transactional
	public List<RelIngresoArticulo> listaRelIngresoArticuloByIngreso(int id){
		return relIngresoArticuloDao.listaRelIngresoArticuloByIngreso(id);
	}
	@Transactional
	public Long cantidadIngresoArticulo(int id,boolean inventariable){
		return relIngresoArticuloDao.cantidadIngresoArticulo(id,inventariable);
	}
	
}
