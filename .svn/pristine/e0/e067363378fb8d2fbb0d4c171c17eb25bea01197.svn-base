package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.FonoDao;
import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.model.Fono;
import municipalidad.pto.model.Proveedor;
import municipalidad.pto.service.FonoService;

@Service("fonoService")
public class FonoServiceImpl implements FonoService{

	@Autowired
	GenericDao genericDao;
	@Autowired
	FonoDao fonoDao;
	
	@Transactional
	public void persistFono(Fono fono) {
		genericDao.Guardar(fono);
		
	}
	@Transactional
	public Fono findFonoById(int id) {
	
		return fonoDao.findFonoById(id);
	}
	@Transactional
	public void updateFono(Fono fono) {
		genericDao.update(fono);
		
	}
	@Transactional
	public void deleteFono(Fono fono) {
		genericDao.delete(fono);
		
	}
	@Transactional
	public List<Fono> listaFonos() {
		return fonoDao.listaFonos();
	}
	@Transactional
	public List<SelectItem> comboFono(){
		return fonoDao.comboFono();
	}
	@Transactional
	public List<Fono> listaFonosByProveedor(Integer proveedor){
		return fonoDao.listaFonosByProveedor(proveedor);
	}
	@Transactional
	public List<String> nombreFonoByName(String fono){
		return fonoDao.nombreFonoByName(fono);
	}
	
}
