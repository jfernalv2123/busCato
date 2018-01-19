package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import municipalidad.pto.dao.FacturasDao;
import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.model.Facturas;
import municipalidad.pto.service.FacturasService;

@Service("facturasService")
public class FacturasServiceImpl implements FacturasService{

	@Autowired
	GenericDao genericDao;
	@Autowired
	FacturasDao facturasDao;
	
	@Transactional
	public void persistFacturas(Facturas facturas) {
		genericDao.Guardar(facturas);
		
	}
	@Transactional
	public void updateFacturas(Facturas facturas) {
		genericDao.update(facturas);
		
	}
	@Transactional
	public void deleteFacturas(Facturas facturas) {
		genericDao.delete(facturas);
		
	}
	@Transactional
	public Facturas findFacturasById(int id){
		return facturasDao.findFacturasById(id);
	}
	@Transactional
	public List<Facturas> listaFacturas(){
		return facturasDao.listaFacturas();
	}
	@Transactional
	public List<Facturas> listaFacturasByIngreso(int id){
		return facturasDao.listaFacturasByIngreso(id);
	}
	@Transactional
	public List<SelectItem> comboFacturas(){
		return facturasDao.comboFacturas();
	}
}
