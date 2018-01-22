package municipalidad.pto.service.impl;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.ParadasDao;
import municipalidad.pto.model.Paradas;
import municipalidad.pto.service.ParadasService;

@Service("paradasService")
public class ParadasServiceImpl implements ParadasService{

	@Autowired
	ParadasDao paradasDao;
	
	@Transactional
	public void guardar(Paradas ciudad){
		paradasDao.Guardar(ciudad);
	}
	@Transactional
	public void Actualizar(Paradas ciudad){
		paradasDao.actualizar(ciudad);
	}
	@Transactional
	public void borrar(Paradas ciudad){
		paradasDao.borrar(ciudad);
	}
	@Transactional
	public Paradas buscarPorId(int id){
		return paradasDao.buscarPorId(id);
	}
	@Transactional
	public List<Paradas> listaParadas(){
		return paradasDao.listaParadas();
	}
	@Transactional
	public List<SelectItem> comboParadas(){
		return paradasDao.comboParadas();
	}
	@Transactional
	public List<SelectItem> comboParadaPorFechaCiudad(Integer idCiudad, Date fecha){
		return paradasDao.comboParadaPorFechaCiudad(idCiudad, fecha);
	}
	@Transactional
	public Long numeroParada(Integer idRecorrido){
		return paradasDao.numeroParada(idRecorrido);
	}
	@Transactional
	public SelectItem ComboParadasCiudadNumero(Integer idRecorrido, Integer parada){
		return paradasDao.ComboParadasCiudadNumero(idRecorrido, parada);
	}
	@Transactional
	public List<SelectItem> comboParadasPorRecorrido(Integer idRecorrido){
		return paradasDao.comboParadasPorRecorrido(idRecorrido);
	}
	@Transactional
	public List<Paradas> listaParadasPorFechaCiudad(Integer idCiudad,Date fechaDesde,Date fechaHasta){
		return paradasDao.listaParadasPorFechaCiudad(idCiudad, fechaDesde, fechaHasta);
	}
	@Transactional
	public Paradas paradaPorCiudadRecorrido(Integer idCiudad,Integer idRecorido){
		return paradasDao.paradaPorCiudadRecorrido(idCiudad, idRecorido);
	}
	@Transactional
	public List<Paradas> listaComboParadaPorFechaCiudad(Integer idCiudad, Date fecha){
		return paradasDao.listaComboParadaPorFechaCiudad(idCiudad, fecha);
	}
	@Transactional
	public Paradas paradaCiudadNumero(Integer idRecorrido, Integer parada){
		return paradasDao.paradaCiudadNumero(idRecorrido, parada);
	}
}
