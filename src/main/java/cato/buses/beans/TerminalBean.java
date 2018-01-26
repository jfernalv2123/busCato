package cato.buses.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import cato.buses.model.Ciudad;
import cato.buses.model.Terminal;
import cato.buses.service.CiudadService;
import cato.buses.service.TerminalService;

@ManagedBean
@SessionScoped
public class TerminalBean {
	@ManagedProperty(value = "#{ciudadService}")
	CiudadService ciudadService;
	@ManagedProperty(value = "#{terminalService}")
	TerminalService terminalService;

	public void setCiudadService(CiudadService ciudadService) {
		this.ciudadService = ciudadService;
	}
	public void setTerminalService(TerminalService terminalService) {
		this.terminalService = terminalService;
	}
	
	private String terminal;
	private Integer andenes;
	private Ciudad ciudad;
	private Integer idCiudad;
	private Terminal terminalAux;
	
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public Integer getAndenes() {
		return andenes;
	}
	public void setAndenes(Integer andenes) {
		this.andenes = andenes;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}
	
	public Terminal getTerminalAux() {
		return terminalAux;
	}
	public void setTerminalAux(Terminal terminalAux) {
		this.terminalAux = terminalAux;
	}
	public void guardar(){
		Terminal terminal=new Terminal();
		terminal.setAndenes(getAndenes());
		terminal.setTerminal(getTerminal());
		terminal.setCiudad(ciudadService.buscarPorId(getIdCiudad()));
		terminalService.guardar(terminal);
		mensaje("guardado",terminal.getTerminal());
	}
	public void carga(Terminal terminal){
		terminalAux =terminal;
	}
	public void actualizar(){
		terminalService.Actualizar(terminalAux);
		mensaje("Actualizado",terminalAux.getTerminal());
	}
	public List<SelectItem> filtroAndenes(){
		List<SelectItem> aux = terminalService.comboAndenesTerminal();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	}
	public List<SelectItem> filtroTerminal(){
		List<SelectItem> aux = terminalService.comboTerminal();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	}
	public List<Terminal> listaTerminal(){
		return terminalService.listaTerminal();
	}

	public void borrar(Terminal terminal) {
		terminalService.borrar(terminal);
		mensaje("Borrado", terminal.getTerminal());
	}
public List<SelectItem> comboTerminal(){
	return terminalService.comboTerminal();
}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
}
