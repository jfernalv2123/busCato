package municipalidad.pto.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.ChoferRecorridoDao;
import municipalidad.pto.model.ChoferRecorrido;
import municipalidad.pto.service.ChoferRecorridoService;

@Service("choferRecorridoService")
public class ChoferRecorridoServiceImpl implements ChoferRecorridoService{

	@Autowired
	ChoferRecorridoDao choferRecorridoDao;
	
	@Transactional
	public void guadar(ChoferRecorrido choferRecorrido){
		choferRecorridoDao.Guardar(choferRecorrido);
	}
	@Transactional
	public void Actualizar(ChoferRecorrido choferRecorrido){
		choferRecorridoDao.actualizar(choferRecorrido);
	}
	@Transactional
	public void borrar(ChoferRecorrido choferRecorrido){
		choferRecorridoDao.borrar(choferRecorrido);
	}
	@Transactional
	public ChoferRecorrido buscarPorId(int id){
		return choferRecorridoDao.buscarPorId(id);
	}
	@Transactional
	public List<ChoferRecorrido> listaChoferRecorrido(){
		return choferRecorridoDao.listaChoferRecorrido();
	}
	
}
