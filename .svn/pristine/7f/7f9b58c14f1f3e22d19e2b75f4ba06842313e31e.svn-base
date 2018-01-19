package municipalidad.pto.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import municipalidad.pto.model.Articulos;
import municipalidad.pto.model.InformeInventario;
import municipalidad.pto.model.RelInformeArticulo;
import municipalidad.pto.model.Ubicacion;
import municipalidad.pto.objetos.CantidadArticulos;
import municipalidad.pto.service.ArticulosService;
import municipalidad.pto.service.InformeInventarioService;
import municipalidad.pto.service.RelInformeArticuloService;


@ManagedBean
@SessionScoped
public class InformeBean implements Serializable{
	
	@ManagedProperty(value="#{informeInventarioService}")
	InformeInventarioService informeInventarioService;
	
	@ManagedProperty(value="#{relInformeArticuloService}")
	RelInformeArticuloService relInformeArticuloService;
	
	@ManagedProperty(value="#{articulosService}")
	ArticulosService articulosService;
	
	private InformeInventario infInv;
	private Date fecha;
	private String encargadoInventario;
	private String encargadoDepartamento;
	private Ubicacion ubicacion;
	private String dependencia;
	private Integer cantidad;
	private Integer idArticulo;
	private Integer idUbicacion;
	private String codigoAntiguo;
	private List<Articulos> listArticulosAux = new ArrayList<Articulos>();
	private List<InformeInventario> listaInformeAux;
	private List<CantidadArticulos> listaCantidadArticulos=new ArrayList<CantidadArticulos>();
	private List<RelInformeArticulo> listaRelInformeAux = new ArrayList<RelInformeArticulo>();
	private List<RelInformeArticulo> listaRelInforme;
	
	public void setInformeInventarioService(InformeInventarioService informeInventarioService) {
		this.informeInventarioService = informeInventarioService;
	}
	
	public void setRelInformeArticuloService(RelInformeArticuloService relInformeArticuloService) {
		this.relInformeArticuloService = relInformeArticuloService;
	}

	public void setArticulosService(ArticulosService articulosService) {
		this.articulosService = articulosService;
	}

	public InformeInventario getInfInv() {
		return infInv;
	}

	public void setInfInv(InformeInventario infInv) {
		this.infInv = infInv;
	}

	public List<InformeInventario> getListaInformeAux() {
		return listaInformeAux;
	}

	public void setListaInformeAux(List<InformeInventario> listaInformeAux) {
		this.listaInformeAux = listaInformeAux;
	}

	public List<InformeInventario> listaInforme(){
		return informeInventarioService.listaInformeInventario();
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getEncargadoInventario() {
		return encargadoInventario;
	}

	public void setEncargadoInventario(String encargadoInventario) {
		this.encargadoInventario = encargadoInventario;
	}

	public String getEncargadoDepartamento() {
		return encargadoDepartamento;
	}

	public void setEncargadoDepartamento(String encargadoDepartamento) {
		this.encargadoDepartamento = encargadoDepartamento;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getDependencia() {
		return dependencia;
	}

	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	
	public List<Articulos> getListArticulosAux() {
		return listArticulosAux;
	}

	public void setListArticulosAux(List<Articulos> listArticulosAux) {
		this.listArticulosAux = listArticulosAux;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public List<CantidadArticulos> getListaCantidadArticulos() {
		return listaCantidadArticulos;
	}

	public void setListaCantidadArticulos(List<CantidadArticulos> listaCantidadArticulos) {
		this.listaCantidadArticulos = listaCantidadArticulos;
	}

	public Integer getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(Integer idArticulo) {
		this.idArticulo = idArticulo;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public List<RelInformeArticulo> getListaRelInforme() {
		return listaRelInforme;
	}

	public void setListaRelInforme(List<RelInformeArticulo> listaRelInforme) {
		this.listaRelInforme = listaRelInforme;
	}

	public List<RelInformeArticulo> getListaRelInformeAux() {
		return listaRelInformeAux;
	}

	public void setListaRelInformeAux(List<RelInformeArticulo> listaRelInformeAux) {
		this.listaRelInformeAux = listaRelInformeAux;
	}

	public String getCodigoAntiguo() {
		return codigoAntiguo;
	}

	public void setCodigoAntiguo(String codigoAntiguo) {
		this.codigoAntiguo = codigoAntiguo;
	}

	public void guardarInforme(){
		InformeInventario inf=new InformeInventario();
		Ubicacion ub=new Ubicacion();
		ub.setIdUbicacion(getIdUbicacion());
		inf.setDependencia(getDependencia());
		inf.setEncargadoDepartamento(getEncargadoDepartamento());
		inf.setEncargadoInventario(getEncargadoInventario());
		inf.setFecha(getFecha());
		inf.setUbicacion(ub);
informeInventarioService.guardarInformeInventario(inf);
		inf.setIdInforme(informeInventarioService.ultimoInforme());
		
		for(CantidadArticulos art:listaCantidadArticulos){
			RelInformeArticulo rinf=new RelInformeArticulo();
			rinf.setArticulo(art.getArticulo());
			rinf.setCantidad(art.getCantidad());
			rinf.setInforme(inf);
			relInformeArticuloService.guardarRelInformeArticulos(rinf);
		}
		setIdUbicacion(null);
		setDependencia(null);
		setEncargadoDepartamento(null);
		setEncargadoInventario(null);
		setFecha(null);
		listaCantidadArticulos.clear();
		
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
	
	public void addArticuloCantidad() {
		CantidadArticulos cantidadArticulos = new CantidadArticulos();
		boolean aux = true;
		if (getCantidad() != null) {
			Articulos art = articulosService.findArticuloByCodigo(getCodigoAntiguo());
			cantidadArticulos.setArticulo(art);
			cantidadArticulos.setCantidad(getCantidad());
			if (art != null) {
				for (CantidadArticulos cant : listaCantidadArticulos) {
					if (cant.getArticulo().getIdArticulos() == art.getIdArticulos()) {
						aux = false;
					}
				}
				if (aux) {
					listaCantidadArticulos.add(cantidadArticulos);
				} else {
					mensaje("Ya Existe ", art.getArticulo());

				}

			}
		}
	}
public void modificar(InformeInventario informe){
	listaRelInforme = relInformeArticuloService.listaRelInformeArticuloByInforme(informe.getIdInforme());
	infInv = informe;
	}
public void borrarInforme(InformeInventario informe){
	for(RelInformeArticulo rinf:relInformeArticuloService.listaRelInformeArticuloByInforme(informe.getIdInforme())){
		relInformeArticuloService.deleteRelInformeArticulo(rinf);
	}
	informeInventarioService.deleteInformeInventario(informe);
}
}
