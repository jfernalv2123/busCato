package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.RecorridoDao;
import municipalidad.pto.dao.RegionDao;
import municipalidad.pto.model.Recorrido;
import municipalidad.pto.model.RegionChile;
import municipalidad.pto.service.RegionService;

@Service("regionService")
public class RegionServiceImpl implements RegionService{

	@Autowired
	RegionDao regionDao;
	
	@Transactional
	public void guardar(RegionChile recorrido){
		regionDao.Guardar(recorrido);
	}
	@Transactional
	public void Actualizar(RegionChile recorrido){
		regionDao.actualizar(recorrido);
	}
	@Transactional
	public void borrar(RegionChile recorrido){
		regionDao.borrar(recorrido);
	}
	@Transactional
	public RegionChile buscarPorId(int id){
		return regionDao.buscarPorId(id);
	}
	@Transactional
	public List<RegionChile> listaRegion(){
		return regionDao.listaRegion();
	}
	@Transactional
	public List<SelectItem> comboRegion(){
		return regionDao.comboRegion();
	}
}
