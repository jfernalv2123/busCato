package cato.buses.service.impl;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cato.buses.dao.RecorridoDao;
import cato.buses.model.Recorrido;
import cato.buses.service.RecorridosService;

@Service("recorridosService")
public class RecorridosServiceImpl implements RecorridosService{
	
	@Autowired
	RecorridoDao recorridoDao;
	
	@Transactional
	public void guardar(Recorrido recorrido){
		recorridoDao.Guardar(recorrido);
	}
	@Transactional
	public void Actualizar(Recorrido recorrido){
		recorridoDao.actualizar(recorrido);
	}
	@Transactional
	public void borrar(Recorrido recorrido){
		recorridoDao.borrar(recorrido);
	}
	@Transactional
	public Recorrido buscarPorId(int id){
		return recorridoDao.buscarPorId(id);
	}
	@Transactional
	public List<Recorrido> listaRecorrido(){
		return recorridoDao.listaRecorrido();
	}
	@Transactional
	public List<SelectItem> comboRecorrido(){
		return recorridoDao.comboRecorrido();
	}
	@Transactional
	public List<Recorrido> recorridoPorFecha(Date desde,Date hasta){
		return recorridoDao.recorridoPorFecha(desde, hasta);
	}
	@Transactional
	public List<SelectItem> comboRecorridoPorFecha(Date desde,Date hasta){
		return recorridoDao.comboRecorridoPorFecha(desde, hasta);
	}
}
