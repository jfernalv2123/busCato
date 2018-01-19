package municipalidad.pto.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import municipalidad.pto.dao.FacturasDao;
import municipalidad.pto.model.Facturas;

@Repository("facturasDao")
public class FacturasDaoImpl implements FacturasDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public Facturas findFacturasById(int id) {
		return (Facturas) sessionFactory.getCurrentSession().get(Facturas.class, id);
	}
	public List<Facturas> listaFacturas() {

		String query="FROM Facturas as f";
		List<Facturas> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	public List<Facturas> listaFacturasByIngreso(int id) {

		String query="FROM Facturas as f where f.ingreso.idIngreso="+id;
		List<Facturas> aux= sessionFactory.getCurrentSession().createQuery(query).list();

		return aux;
	}
	
	public List<SelectItem> comboFacturas(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		
		String query="SELECT f.idFactura,f.factura FROM Facturas as f";
		Iterator iter = sessionFactory.getCurrentSession().createQuery(query).iterate();
		while (iter.hasNext()) {
			SelectItem item=new SelectItem();
			Object[] combo = (Object[]) iter.next();
			item.setLabel(String.valueOf(combo[1]));
			item.setValue(String.valueOf(combo[0]));
			
			aux.add(item);
		}
		return aux;
	}
}
