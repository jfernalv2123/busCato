package municipalidad.pto.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.RowEditEvent;

import municipalidad.pto.model.Estado;
import municipalidad.pto.model.Tipo;
import municipalidad.pto.service.EstadoService;

@ManagedBean
@SessionScoped
public class EstadoBean implements Serializable {

	@ManagedProperty(value = "#{estadoService}")
	EstadoService estadoService;

	private Integer idEstado;
	private String estado;

	public void setEstadoService(EstadoService estadoService) {
		this.estadoService = estadoService;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void guardar() {
		Estado estado = new Estado();
		estado.setEstado(getEstado());
		FacesContext context = FacesContext.getCurrentInstance();
		if(getEstado().equals("")){
			
	        context.addMessage(null, new FacesMessage("Error",  "debe ingresar un Estado") );
		}else{
			estadoService.persistEstado(estado);
			context.addMessage(null, new FacesMessage("Guardado",  getEstado()) );
		}
		
		setEstado(null);
	}

	public void borrar(int id) {
		Estado estado = estadoService.findEstadoById(id);
		estadoService.deleteEstado(estado);
	}
	
	public List<Estado> lista(){
		return estadoService.listaEstados();
	}
	public List<SelectItem> selectItem(){
		return estadoService.comboEstado();
	}
	public List<SelectItem> filtroEstado(){
		List<SelectItem> aux=estadoService.comboEstado();
		SelectItem s=new SelectItem();
		s.setLabel("Seleccione");
		s.setValue("");
		aux.add(s);
		return aux;
	
	}

	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Editado", ((Estado) event.getObject()).getEstado() + " a " + getEstado());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		Estado estado = (Estado) event.getObject();
		estado.setEstado(getEstado());
		estadoService.updateEstado(estado);
		setEstado(null);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Cancelada", ((Estado) event.getObject()).getEstado());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
