package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.dao.RazonSocialDao;
import municipalidad.pto.model.RazonSocial;
import municipalidad.pto.service.RazonSocialService;

@Service("razonSocialService")
public class RazonSocialServiceImpl implements RazonSocialService{
	@Autowired
	GenericDao genericDao;
	@Autowired
	RazonSocialDao razonSocialDao;
	
	@Transactional
	public void persistRazonSocial(RazonSocial razonSocial) {
		genericDao.Guardar(razonSocial);
		
	}
	@Transactional
	public void updateRazonSocial(RazonSocial razonSocial) {
		genericDao.update(razonSocial);
		
	}
	@Transactional
	public void deleteRazonSocial(RazonSocial razonSocial) {
		genericDao.delete(razonSocial);
		
	}
	@Transactional
	public RazonSocial findRazonSocialById(int id){
		return razonSocialDao.findRazonSocialById(id);
	}
	@Transactional
	public List<RazonSocial> listaRazonSocial(){
		return razonSocialDao.listaRazonSocial();
	}
	@Transactional
	public List<SelectItem> comboRazonSocial(){
		return razonSocialDao.comboRazonSocial();
	}
}
