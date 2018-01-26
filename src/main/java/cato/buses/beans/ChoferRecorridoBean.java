package cato.buses.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import cato.buses.model.ChoferRecorrido;
import cato.buses.service.ChoferRecorridoService;
import cato.buses.service.ChoferService;
import cato.buses.service.RecorridosService;

@ManagedBean
@SessionScoped
public class ChoferRecorridoBean {

	@ManagedProperty(value = "#{recorridosService}")
	RecorridosService recorridosService;
	@ManagedProperty(value = "#{choferService}")
	ChoferService choferService;
	@ManagedProperty(value = "#{choferRecorridoService}")
	ChoferRecorridoService choferRecorridoService;
	
	private Integer idRecorrido;
	private Integer idChofer;
	private Integer tiempo;
	private ChoferRecorrido choferRecorridoAux;
	
	public Integer getIdRecorrido() {
		return idRecorrido;
	}
	public void setIdRecorrido(Integer idRecorrido) {
		this.idRecorrido = idRecorrido;
	}
	public Integer getIdChofer() {
		return idChofer;
	}
	public void setIdChofer(Integer idChofer) {
		this.idChofer = idChofer;
	}
	public Integer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	public void setRecorridosService(RecorridosService recorridosService) {
		this.recorridosService = recorridosService;
	}
	public void setChoferService(ChoferService choferService) {
		this.choferService = choferService;
	}
	
	public ChoferRecorrido getChoferRecorridoAux() {
		return choferRecorridoAux;
	}
	public void setChoferRecorridoAux(ChoferRecorrido choferRecorridoAux) {
		this.choferRecorridoAux = choferRecorridoAux;
	}
	public void setChoferRecorridoService(ChoferRecorridoService choferRecorridoService) {
		this.choferRecorridoService = choferRecorridoService;
	}
	public List<ChoferRecorrido> listaChoferRecorrido(){
		return choferRecorridoService.listaChoferRecorrido();
	}
	public void guardar(){
		ChoferRecorrido choRe= new ChoferRecorrido();
		choRe.setTiempo(getTiempo());
		choRe.setChofer(choferService.buscarPorId(getIdChofer()));
		choRe.setRecorrido(recorridosService.buscarPorId(getIdRecorrido()));
		choferRecorridoService.guadar(choRe);
		mensaje("Guardado",choRe.getRecorrido().getDestino().getTerminal());
	}
	public void carga(ChoferRecorrido cR){
		choferRecorridoAux=cR;
	}
	public void actualizar(){
		choferRecorridoService.Actualizar(choferRecorridoAux);
		mensaje("Actualizado",choferRecorridoAux.getRecorrido().getDestino().getTerminal());
	}
	public void borrar(ChoferRecorrido cR){
		choferRecorridoService.borrar(cR);
		mensaje("Borrado",cR.getRecorrido().getDestino().getTerminal());
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
	
}
