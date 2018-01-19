package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.AreaDao;
import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.model.AreaArticulo;
import municipalidad.pto.service.AreaService;

@Service("areaService")
public class AreaServiceImpl implements AreaService{

	@Autowired
	AreaDao areaDao;
	@Autowired
	GenericDao genericDao;
	
	@Transactional
	public void persistArea(AreaArticulo area) {
		genericDao.Guardar(area);
		
	}
	@Transactional
	public AreaArticulo findAreaById(int id) {
	
		return areaDao.findAreaById(id);
	}
	@Transactional
	public void updateArea(AreaArticulo area) {
		genericDao.update(area);
		
	}
	@Transactional
	public void deleteArea(AreaArticulo area) {
		genericDao.delete(area);
		
	}
	@Transactional
	public List<AreaArticulo> listaAreas() {
		return areaDao.listaAreas();
	}
	@Transactional
	public List<SelectItem> comboArea(){
		return areaDao.comboArea();
	}
	
}
