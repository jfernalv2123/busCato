package cato.buses.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.sql.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cato.buses.dao.BusDao;
import cato.buses.model.Bus;
import cato.buses.service.BusService;

@Service("busService")
public class BusServiceImpl implements BusService{

	@Autowired
	BusDao busDao;

	@Transactional
	public void guardar(Bus bus){
		busDao.Guardar(bus);
	}
	@Transactional
	public void Actualizar(Bus bus){
		busDao.actualizar(bus);
	}
	@Transactional
	public void borrar(Bus bus){
		busDao.borrar(bus);
	}
	@Transactional
	public Bus buscarPorId(int id){
		return busDao.buscarPorId(id);
	}
	@Transactional
	public List<Bus> listaBus(){
		return busDao.listabus();
	}
	@Transactional
	public List<SelectItem> comboBus(){
		return busDao.comboBus();
	}
	@Transactional
	public List<SelectItem> comboWcBus(){
		return busDao.comboWcBus();
	}
	@Transactional
	public List<SelectItem> comboPisosBus(){
		return busDao.comboPisosBus();
	}
}
