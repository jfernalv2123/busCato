package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.dao.UnidadMedidaDao;
import municipalidad.pto.model.UnidadMedida;
import municipalidad.pto.service.UnidadMedidaService;

@Service("unidadMedidaService")
public class UnidadMedidaServiceImpl implements UnidadMedidaService {

	@Autowired
	GenericDao genericDao;
	
	@Autowired
	UnidadMedidaDao unidadMedidaDao;
	
	@Transactional
	public void persistUnidadMedida(UnidadMedida unidadMedida) {
		genericDao.Guardar(unidadMedida);
		
	}
	@Transactional
	public UnidadMedida findUnidadMedidaById(int id) {
	
		return unidadMedidaDao.findUnidadMedidaById(id);
	}
	@Transactional
	public void updateUnidadMedida(UnidadMedida unidadMedida) {
		genericDao.update(unidadMedida);
		
	}
	@Transactional
	public void deleteUnidadMedida(UnidadMedida unidadMedida) {
		genericDao.delete(unidadMedida);
		
	}
	@Transactional
	public List<UnidadMedida> listaUnidadMedida() {
		return unidadMedidaDao.listaUnidadMedidas();
	}
	@Transactional
	public List<SelectItem> comboUnidadMedida(){
		return unidadMedidaDao.comboUnidadMedida();
	}
}
