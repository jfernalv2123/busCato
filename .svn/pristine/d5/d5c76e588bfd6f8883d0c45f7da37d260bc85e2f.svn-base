package municipalidad.pto.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.dao.InformeInventarioDao;
import municipalidad.pto.model.InformeInventario;
import municipalidad.pto.service.InformeInventarioService;
@Service("informeInventarioService")
public class InformeInventarioServiceImpl implements InformeInventarioService{
	@Autowired
	GenericDao genericDao;
	@Autowired
	InformeInventarioDao informeInventarioDao;
	
	@Transactional
	public InformeInventario findInformeInventarioById(int id){
		return informeInventarioDao.findInformeInventarioById(id);
	}
	@Transactional
	public List<InformeInventario> listaInformeInventario(){
		return informeInventarioDao.listaInformeInventario();
	}
	@Transactional
	public void updateInformeInventario(InformeInventario informe){
		genericDao.update(informe);
	}
	@Transactional
	public void deleteInformeInventario(InformeInventario informe){
		genericDao.delete(informe);
	}
	@Transactional
	public void guardarInformeInventario(InformeInventario informe){
		genericDao.Guardar(informe);
	}
	@Transactional
	public Integer ultimoInforme(){
		return informeInventarioDao.ultimoInforme();
	}
}
