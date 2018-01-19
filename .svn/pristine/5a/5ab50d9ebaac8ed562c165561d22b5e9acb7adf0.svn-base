package municipalidad.pto.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.event.RowEditEvent;
import municipalidad.pto.model.RazonSocial;
import municipalidad.pto.service.RazonSocialService;

@ManagedBean
@SessionScoped
public class RazonSocialBean {
	@ManagedProperty(value="#{razonSocialService}")
	RazonSocialService razonSocialService;
	
	private String razonSocial;

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public void setRazonSocialService(RazonSocialService razonSocialService) {
		this.razonSocialService = razonSocialService;
	}
	
	
	public void persistRazonSocial() {
		RazonSocial razonSocial=new RazonSocial();
		razonSocial.setRazonSocial(getRazonSocial());
		FacesContext context = FacesContext.getCurrentInstance();
		if(getRazonSocial().equals("")){
	        context.addMessage(null, new FacesMessage("Error",  "debe ingresar un Area") );
		}else{
			razonSocialService.persistRazonSocial(razonSocial);
		context.addMessage(null, new FacesMessage("Guardado",  getRazonSocial()) );
		}
		setRazonSocial(null);
	}


	public void deleteRazonSocial(Integer id) {

		RazonSocial razonSocial = razonSocialService.findRazonSocialById(id);
		razonSocialService.deleteRazonSocial(razonSocial);

	}
	
	
	public List<RazonSocial> listaRazonSocial() {
		return razonSocialService.listaRazonSocial();
	}
	
	public List<SelectItem> comboRazonSocial(){
		return razonSocialService.comboRazonSocial();
	}
	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Editado", ((RazonSocial) event.getObject()).getRazonSocial() + " a " + getRazonSocial());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		RazonSocial razon = (RazonSocial) event.getObject();
		razon.setRazonSocial(getRazonSocial());
		razonSocialService.updateRazonSocial(razon);
		setRazonSocial(null);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Cancelada", ((RazonSocial) event.getObject()).getRazonSocial());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
