package cato.buses.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import cato.buses.model.Ciudad;
import cato.buses.model.RegionChile;
import cato.buses.service.CiudadService;
import cato.buses.service.RegionService;

@ManagedBean
@SessionScoped
public class CiudadBean {

	@ManagedProperty(value = "#{ciudadService}")
	CiudadService ciudadService;

	@ManagedProperty(value = "#{regionService}")
	RegionService regionService;
	
	public void setCiudadService(CiudadService ciudadService) {
		this.ciudadService = ciudadService;
	}
	
	public void setRegionService(RegionService regionService) {
		this.regionService = regionService;
	}

	private String ciudad;
	private RegionChile region;
	private Ciudad ciudadAux;
	private Integer idRegion;

	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public RegionChile getRegion() {
		return region;
	}
	public void setRegion(RegionChile region) {
		this.region = region;
	}
	public Ciudad getCiudadAux() {
		return ciudadAux;
	}
	public void setCiudadAux(Ciudad ciudadAux) {
		this.ciudadAux = ciudadAux;
	}
	
	public Integer getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(Integer idRegion) {
		this.idRegion = idRegion;
	}
	public List<Ciudad> listaCiudad(){
		return ciudadService.listaCiudad();
	}
	public void guardar(){
		Ciudad ciudad=new Ciudad();
		ciudad.setCiudad(getCiudad());
		setRegion(regionService.buscarPorId(getIdRegion()));
		ciudad.setRegion(getRegion());
		ciudadService.guardar(ciudad);
		mensaje("Guardado",ciudad.getCiudad());
	}
	public void borrar(Ciudad ciudad){
		ciudadService.borrar(ciudad);
		mensaje("Borrada",ciudad.getCiudad());
	}
	public void carga(Ciudad ciudad){
		ciudadAux=ciudad;
	}
	public void actualizar(){
		ciudadService.Actualizar(ciudadAux);
		mensaje("Actualizado",ciudadAux.getCiudad());
	}
	public List<SelectItem> comboCiudad(){
		return ciudadService.comboCiudad();
	}
	public List<SelectItem> filtroRegion(){
		List<SelectItem> aux = regionService.comboRegion();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	
	}
	public List<SelectItem> filtroCiudad(){
		List<SelectItem> aux = ciudadService.comboCiudad();
		SelectItem s1=new SelectItem();
		s1.setLabel("Seleccione");
		s1.setValue("");
		aux.add(s1);
		return aux;
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
}
