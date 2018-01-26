package cato.buses.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cato.buses.dao.BoletoDao;
import cato.buses.model.Boleto;
import cato.buses.model.Paradas;
import cato.buses.model.Recorrido;
import cato.buses.service.BoletoService;

@Service("boletoService")
public class BoletoServiceImpl implements BoletoService {

	@Autowired
	BoletoDao boletoDao;

	@Transactional
	public void guardar(Boleto boleto) {
		boletoDao.Guardar(boleto);
	}

	@Transactional
	public void Actualizar(Boleto boleto) {
		boletoDao.actualizar(boleto);
	}

	@Transactional
	public void borrar(Boleto boleto) {
		boletoDao.borrar(boleto);
	}

	@Transactional
	public Boleto buscarPorId(int id) {
		return boletoDao.buscarPorId(id);
	}

	@Transactional
	public List<Boleto> listaBoleto() {
		return boletoDao.listaBoleto();
	}

	@Transactional
	public List<Boleto> asientosDisponiblesPorParadas(Paradas paradaOrigen, Paradas paradaDestino) {
		return boletoDao.asientosDisponiblesPorParadas(paradaOrigen, paradaDestino);
	}

	@Transactional
	public Integer asientosVendidos(Recorrido recorrido) {
		Integer asientos = 0;
		asientos += boletoDao.listaBoletosPorRecorrido(recorrido).size();
		return asientos;
	}

	@Transactional
	public Integer totalVentasRecorrido(Recorrido recorrido) {
		Integer total = 0;
		for (Boleto b : boletoDao.listaBoletosPorRecorrido(recorrido)) {
			total += b.getValor();
		}
		return total;
	}

	@Transactional
	public List<Boleto> listaBoletosPorRecorrido(Recorrido recorrido) {
		return boletoDao.listaBoletosPorRecorrido(recorrido);
	}

	@Transactional
	public List<Boleto> listaBoletoPorFechas(Date desde, Date hasta, Integer idCiudadOrigen, Integer idCiudadDestino) {
		return boletoDao.listaBoletoPorFechas(desde, hasta,idCiudadOrigen,idCiudadDestino);
	}
	@Transactional
	public Integer ventasPorFecha(Date desde, Date hasta, Integer idCiudadOrigen, Integer idCiudadDestino) {
		List<Boleto> lista = boletoDao.listaBoletoPorFechas(desde, hasta,idCiudadOrigen,idCiudadDestino);
		Integer total = 0;
		for (Boleto b : lista) {
			total += b.getValor();
		}
		return total;
	}

}
