package municipalidad.pto.beans;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import municipalidad.pto.model.RegionChile;
import municipalidad.pto.service.RegionService;

@ManagedBean
@SessionScoped
public class RegionBean {

	@ManagedProperty(value = "#{regionService}")
	RegionService regionService;

	public void setRegionService(RegionService regionService) {
		this.regionService = regionService;
	}
	
	private RegionChile regionAux;
	private String region;

	public RegionChile getRegionAux() {
		return regionAux;
	}
	public void setRegionAux(RegionChile regionAux) {
		this.regionAux = regionAux;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void guardar(){
		RegionChile region=new RegionChile();
		region.setRegion(getRegion());
		regionService.guardar(region);
		mensaje("Guardado",region.getRegion());
	}
	private void cargar(RegionChile region){
         regionAux=region;
	}
	public void actualizar(){
		regionService.Actualizar(regionAux);
	}
	public List<SelectItem> comboRegion(){
		return regionService.comboRegion();
	}
	public List<RegionChile> listaRegion(){
		return regionService.listaRegion();
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
	
}
