package municipalidad.pto.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.RowEditEvent;

import municipalidad.pto.model.AreaArticulo;
import municipalidad.pto.model.Ubicacion;
import municipalidad.pto.service.UbicacionService;

@ManagedBean
@SessionScoped
public class UbicacionBean {

	@ManagedProperty(value = "#{ubicacionService}")
	UbicacionService ubicacionService;

	private String ubicacion;

	public void setUbicacionService(UbicacionService ubicacionService) {
		this.ubicacionService = ubicacionService;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void guardar() {
		Ubicacion ub = new Ubicacion();
		ub.setUbicacion(getUbicacion());
		FacesContext context = FacesContext.getCurrentInstance();
		if (getUbicacion().equals("")) {
			context.addMessage(null, new FacesMessage("Error", "debe ingresar una Ubicación"));
		} else {
			ubicacionService.persistUbicacion(ub);
			context.addMessage(null, new FacesMessage("Guardado", getUbicacion()));
		}
		setUbicacion(null);
	}

	public void borrar(int id) {
		Ubicacion ub = ubicacionService.findUbicacionById(id);
		ubicacionService.deleteUbicacion(ub);
	}

	public List<Ubicacion> lista() {
		return ubicacionService.listaUbicacion();
	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Editado",
				((Ubicacion) event.getObject()).getUbicacion() + " a " + getUbicacion());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		Ubicacion ub = (Ubicacion) event.getObject();
		ub.setUbicacion(getUbicacion());
		ubicacionService.updateUbicacion(ub);
		setUbicacion(null);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Cancelada", ((Ubicacion) event.getObject()).getUbicacion());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
public List<SelectItem> comboUbicacion(){
	return ubicacionService.comboUbicacion();
}
public List<SelectItem> filtroUbicacion(){
	List<SelectItem> aux=ubicacionService.comboUbicacion();
	SelectItem s= new SelectItem();
	s.setValue("");
	s.setLabel("Seleccione");
	aux.add(s);
	return aux;

}
}
