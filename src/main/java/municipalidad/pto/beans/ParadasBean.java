package municipalidad.pto.beans;

import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import municipalidad.pto.model.Paradas;
import municipalidad.pto.service.ParadasService;
import municipalidad.pto.service.RecorridosService;
import municipalidad.pto.service.TerminalService;

@ManagedBean
@SessionScoped
public class ParadasBean {

	@ManagedProperty(value = "#{paradasService}")
	ParadasService paradasService;
	@ManagedProperty(value = "#{terminalService}")
	TerminalService terminalService;
	@ManagedProperty(value = "#{recorridosService}")
	RecorridosService recorridosService;
	public void setParadasService(ParadasService paradasService) {
		this.paradasService = paradasService;
	}
	public void setTerminalService(TerminalService terminalService) {
		this.terminalService = terminalService;
	}
	public void setRecorridosService(RecorridosService recorridosService) {
		this.recorridosService = recorridosService;
	}
	
	private Integer id;
	private Integer idRecorrido;
	private Integer idTerminal;
	private Date llegada;
	private Integer parada;
	private Integer anden;
	private Paradas paradasAux;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdRecorrido() {
		return idRecorrido;
	}
	public void setIdRecorrido(Integer idRecorrido) {
		this.idRecorrido = idRecorrido;
	}
	public Integer getIdTerminal() {
		return idTerminal;
	}
	public void setIdTerminal(Integer idTerminal) {
		this.idTerminal = idTerminal;
	}
	public Date getLlegada() {
		return llegada;
	}
	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}
	public Integer getParada() {
		return parada;
	}
	public void setParada(Integer parada) {
		this.parada = parada;
	}
	public Integer getAnden() {
		return anden;
	}
	public void setAnden(Integer anden) {
		this.anden = anden;
	}
	public Paradas getParadasAux() {
		return paradasAux;
	}
	public void setParadasAux(Paradas paradasAux) {
		this.paradasAux = paradasAux;
	}
	public void guardar(){
		Paradas parada = new Paradas();
		parada.setAnden(getAnden());
		parada.setParada(paradasService.numeroParada(getIdRecorrido()).intValue()+1);
		parada.setLlegada(getLlegada());
		parada.setRecorrido(recorridosService.buscarPorId(getIdRecorrido()));
		parada.setTerminal(terminalService.buscarPorId(getIdTerminal()));
		
		paradasService.guardar(parada);
		mensaje("Guardada",parada.getRecorrido().getDestino().getTerminal());
	}
	public void carga(Paradas parada){
		paradasAux=parada;
	}
	public void actualizar(){
		paradasService.Actualizar(paradasAux);
		mensaje("Actualizado",paradasAux.getRecorrido().getDestino().getTerminal());
	}
	public List<Paradas> listaParadas(){
		return paradasService.listaParadas();
	}
	public List<SelectItem> comboParadas(){
		return paradasService.comboParadas();
	}
	public void borrar(Paradas parada){
		paradasService.borrar(parada);
		mensaje("Borrado",parada.getRecorrido().getDestino().getTerminal());
	}
	
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
}
