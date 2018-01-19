package municipalidad.pto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.BoletoDao;
import municipalidad.pto.model.Boleto;
import municipalidad.pto.service.BoletoService;

@Service("boletoService")
public class BoletoServiceImpl implements BoletoService{

	@Autowired
	BoletoDao boletoDao;

	@Transactional
	public void guardar(Boleto boleto){
		boletoDao.Guardar(boleto);
	}
	@Transactional
	public void Actualizar(Boleto boleto){
		boletoDao.actualizar(boleto);
	}
	@Transactional
	public void borrar(Boleto boleto){
		boletoDao.borrar(boleto);
	}
	@Transactional
	public Boleto buscarPorId(int id){
		return boletoDao.buscarPorId(id);
	}
	@Transactional
	public List<Boleto> listaBoleto(){
		return boletoDao.listaBoleto();
	}
}
