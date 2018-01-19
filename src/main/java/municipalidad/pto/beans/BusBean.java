package municipalidad.pto.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import municipalidad.pto.model.Bus;
import municipalidad.pto.service.BusService;

@ManagedBean
@SessionScoped
public class BusBean {

	@ManagedProperty(value = "#{busService}")
	BusService busService;

	public void setBusService(BusService busService) {
		this.busService = busService;
	}

	private String patente;
	private Integer asientos;
	private Integer pisos;
	private Integer wc;
	private Bus busAux;
	private List<Bus> listaAux;


	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public Integer getAsientos() {
		return asientos;
	}
	public void setAsientos(Integer asientos) {
		this.asientos = asientos;
	}
	public Integer getPisos() {
		return pisos;
	}
	public void setPisos(Integer pisos) {
		this.pisos = pisos;
	}
	public Integer getWc() {
		return wc;
	}
	public void setWc(Integer wc) {
		this.wc = wc;
	}
	public Bus getBus() {
		return busAux;
	}
	public void setBus(Bus bus) {
		this.busAux = bus;
	}
	public List<Bus> getListaAux() {
		return listaAux;
	}
	public void setListaAux(List<Bus> listaAux) {
		this.listaAux = listaAux;
	}
	
	
	public void guardar(){
		Bus busAux=new Bus();
		busAux.setPatente(getPatente());
		busAux.setAsientos(getAsientos());
		busAux.setPisos(getPisos());
		busAux.setWc(getWc());
		busService.guardar(busAux);
	}
	public void actualizar(){
		Bus busAuxi=busAux;
		
		busService.Actualizar(busAuxi);
	}
	public void borrar(Bus bus){
		busService.borrar(bus);
	}
	public void carga(Bus bus){
		this.busAux=bus;
		
	}
	public List<Bus> listaBuses(){
		return busService.listaBus();
	}
	public List<SelectItem> filtroPisos(){
		List<SelectItem> aux = busService.comboPisosBus();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	
	}
	public List<SelectItem> filtroWc(){
		List<SelectItem> aux = busService.comboWcBus();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	
	}
	public List<SelectItem> filtroBus(){
		List<SelectItem> aux = busService.comboBus();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	
	}
	public List<SelectItem> comboBus(){
		return busService.comboBus();
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
	
}
