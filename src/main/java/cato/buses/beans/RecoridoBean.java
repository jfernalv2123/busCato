package cato.buses.beans;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import cato.buses.model.Recorrido;
import cato.buses.service.BusService;
import cato.buses.service.RecorridosService;
import cato.buses.service.TerminalService;

@ManagedBean
@SessionScoped
public class RecoridoBean {
	
	@ManagedProperty(value = "#{terminalService}")
	TerminalService terminalService;
	@ManagedProperty(value = "#{recorridosService}")
	RecorridosService recorridosService;
	@ManagedProperty(value = "#{busService}")
	BusService busService;
	
	public void setTerminalService(TerminalService terminalService) {
		this.terminalService = terminalService;
	}
	
	
	public void setRecorridosService(RecorridosService recorridosService) {
		this.recorridosService = recorridosService;
	}


	public void setBusService(BusService busService) {
		this.busService = busService;
	}

	private Integer id;
//	private Terminal origen;
//	private Terminal destino;
	private Integer idOrigen;
	private Integer idDestino;
	private Integer idBus;
	private Date fechaSalida;
	private Date fechaLlegada;
	private Recorrido recorridoAux;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdBus() {
		return idBus;
	}
	public void setIdBus(Integer idBus) {
		this.idBus = idBus;
	}
	public Date getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public Date getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public Integer getIdOrigen() {
		return idOrigen;
	}
	public void setIdOrigen(Integer idOrigen) {
		this.idOrigen = idOrigen;
	}
	public Integer getIdDestino() {
		return idDestino;
	}
	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}
	public Recorrido getRecorridoAux() {
		return recorridoAux;
	}
	public void setRecorridoAux(Recorrido recorridoAux) {
		this.recorridoAux = recorridoAux;
	}
	public void guardar(){
		Recorrido recorrido=new Recorrido();
		recorrido.setBus(busService.buscarPorId(getIdBus()));
		recorrido.setDestino(terminalService.buscarPorId(getIdDestino()));
		recorrido.setOrigen(terminalService.buscarPorId(getIdOrigen()));
		recorrido.setFechaLlegada(getFechaLlegada());
		recorrido.setFechaSalida(getFechaSalida());
		recorridosService.guardar(recorrido);
		mensaje("Guardado",recorrido.getDestino().getTerminal());
	}
	public void carga(Recorrido recorrido){
		recorridoAux=recorrido;
	}
	public void actualizar(){
		recorridosService.Actualizar(recorridoAux);
		mensaje("Actualizado",recorridoAux.getDestino().getTerminal());
	}
	public List<Recorrido> listaRecorrido(){
		return recorridosService.listaRecorrido();
	}
	public void borrar(Recorrido recorrido){
		recorridosService.borrar(recorrido);
		mensaje("Borrado",recorrido.getDestino().getTerminal());
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
	public List<SelectItem> comboRecorrido(){
		return recorridosService.comboRecorrido();
	}
	public List<SelectItem> filtroRecorrido(){
		List<SelectItem> aux = recorridosService.comboRecorrido();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	
	}
}
