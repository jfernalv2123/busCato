package cato.buses.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cato.buses.dao.ChoferDao;
import cato.buses.model.Chofer;
import cato.buses.service.ChoferService;

@Service("choferService")
public class ChoferServiceImpl implements ChoferService{

	@Autowired
	ChoferDao choferDao;
	
	@Transactional
	public void guardar(Chofer chofer){
		choferDao.Guardar(chofer);
	}
	@Transactional
	public void Actualizar(Chofer chofer){
		choferDao.actualizar(chofer);
	}
	@Transactional
	public void borrar(Chofer chofer){
		choferDao.borrar(chofer);
	}
	@Transactional
	public Chofer buscarPorId(int id){
		return choferDao.buscarPorId(id);
	}
	@Transactional
	public List<Chofer> listaChofer(){
		return choferDao.listaChofer();
	}
	@Transactional
	public List<SelectItem> comboChofer(){
		return choferDao.comboChofer();
	}
}
