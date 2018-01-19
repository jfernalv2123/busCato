package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.dao.UbicacionDao;

import municipalidad.pto.model.Ubicacion;

import municipalidad.pto.service.UbicacionService;

@Service("ubicacionService")
public class UbicacionServiceImpl implements UbicacionService{

	@Autowired
	UbicacionDao ubicacionDao;
	@Autowired
	GenericDao genericDao;
	
	@Transactional
	public void persistUbicacion(Ubicacion ubicacion) {
		genericDao.Guardar(ubicacion);
		
	}
	@Transactional
	public Ubicacion findUbicacionById(int id) {
	
		return ubicacionDao.findUbicacionById(id);
	}
	@Transactional
	public void updateUbicacion(Ubicacion ubicacion) {
		genericDao.update(ubicacion);
		
	}
	@Transactional
	public void deleteUbicacion(Ubicacion ubicacion) {
		genericDao.delete(ubicacion);
		
	}
	@Transactional
	public List<Ubicacion> listaUbicacion() {
		return ubicacionDao.listaUbicacion();
	}
	@Transactional
	public List<SelectItem> comboUbicacion(){
		return ubicacionDao.comboUbicacion();
	}
}
