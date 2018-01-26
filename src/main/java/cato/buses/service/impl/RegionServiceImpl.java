package cato.buses.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cato.buses.dao.RecorridoDao;
import cato.buses.dao.RegionDao;
import cato.buses.model.Recorrido;
import cato.buses.model.RegionChile;
import cato.buses.service.RegionService;

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
