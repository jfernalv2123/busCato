package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import municipalidad.pto.dao.CiudadDao;
import municipalidad.pto.model.Ciudad;
import municipalidad.pto.service.CiudadService;

@Service("ciudadService")
public class CiudadServiceImpl implements CiudadService{

	@Autowired
	CiudadDao ciudadDao;
	
	@Transactional
	public void guardar(Ciudad ciudad){
		ciudadDao.Guardar(ciudad);
	}
	@Transactional
	public void Actualizar(Ciudad ciudad){
		ciudadDao.actualizar(ciudad);
	}
	@Transactional
	public void borrar(Ciudad ciudad){
		ciudadDao.borrar(ciudad);
	}
	@Transactional
	public Ciudad buscarPorId(int id){
		return ciudadDao.buscarPorId(id);
	}
	@Transactional
	public List<Ciudad> listaCiudad(){
		return ciudadDao.listaCiudad();
	}
	@Transactional
	public List<SelectItem> comboCiudad(){
		return ciudadDao.comboCiudad();
	}
}
