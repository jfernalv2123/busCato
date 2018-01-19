package municipalidad.pto.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import municipalidad.pto.model.Chofer;
import municipalidad.pto.service.ChoferService;

@ManagedBean
@SessionScoped
public class ChoferBean {

	@ManagedProperty(value = "#{choferService}")
	ChoferService choferService;

	public void setChoferService(ChoferService choferService) {
		this.choferService = choferService;
	}
	
	private String rut;
	private String nombre;
	private String apellido;
	private Chofer choferAux;

	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Chofer getChoferAux() {
		return choferAux;
	}
	public void setChoferAux(Chofer choferAux) {
		this.choferAux = choferAux;
	}
	public void guardar(){
		Chofer choferAux=new Chofer();
		choferAux.setApellido(getApellido());
		choferAux.setNombre(getNombre());
		choferAux.setRut(getRut());
		choferService.guardar(choferAux);
		mensaje("Guardado",choferAux.getRut());
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
	public void carga(Chofer chofer){
		this.choferAux=chofer;
	}
	public void actualizar(){
		choferService.Actualizar(choferAux);
		mensaje("Actualizado",choferAux.getRut());
	}
	public List<Chofer> listaChofer(){
		return choferService.listaChofer();
	}
	public void borrar(Chofer chofer){
		choferService.borrar(chofer);
	}
	public List<SelectItem> comboChofer(){
		return choferService.comboChofer();
	}
	public List<SelectItem> filtroChofer(){
		List<SelectItem> aux = choferService.comboChofer();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	
	}
}
