package municipalidad.pto.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;

import com.sun.faces.lifecycle.Phase;

import municipalidad.pto.model.Boleto;
import municipalidad.pto.model.Paradas;
import municipalidad.pto.service.BoletoService;
import municipalidad.pto.service.ParadasService;
import municipalidad.pto.service.RecorridosService;

@ManagedBean
@SessionScoped
public class BoletosBean {

	@ManagedProperty(value = "#{paradasService}")
	ParadasService paradasService;
	@ManagedProperty(value = "#{boletoService}")
	BoletoService boletoService;
	@ManagedProperty(value = "#{recorridosService}")
	RecorridosService recorridosService;
	public void setParadasService(ParadasService paradasService) {
		this.paradasService = paradasService;
	}
	public void setBoletoService(BoletoService boletoService) {
		this.boletoService = boletoService;
	}
	  public void setRecorridosService(RecorridosService recorridosService) {
		this.recorridosService = recorridosService;
	}



	private Integer asiento;
	  private Integer valor;
	  private Boleto boletoAux;
	  private Date fechaBuscar;
	  private Integer idCiudad;
	  private List<SelectItem> comboParadaAux;
	  private List<SelectItem> comboRecorridoAux;
	  private Paradas paradaOrigenAux;
	  private Paradas paradaDestinoAux;
	  private Integer idCiudadOrigen;
	  private Integer idCiudadDestino;
	  private Integer idRecorrido;
	  private Integer idParadaOrigen;
	  private Integer idParadaDestino;
	  private List<Paradas> listaParadaAux;
	
	public Integer getIdCiudadOrigen() {
		return idCiudadOrigen;
	}
	public void setIdCiudadOrigen(Integer idCiudadOrigen) {
		this.idCiudadOrigen = idCiudadOrigen;
	}
	public Integer getIdCiudadDestino() {
		return idCiudadDestino;
	}
	public void setIdCiudadDestino(Integer idCiudadDestino) {
		this.idCiudadDestino = idCiudadDestino;
	}
	public Integer getAsiento() {
		return asiento;
	}
	public void setAsiento(Integer asiento) {
		this.asiento = asiento;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Boleto getBoletoAux() {
		return boletoAux;
	}
	public void setBoletoAux(Boleto boletoAux) {
		this.boletoAux = boletoAux;
	}
	
	public Date getFechaBuscar() {
		return fechaBuscar;
	}
	public void setFechaBuscar(Date fechaBuscar) {
		this.fechaBuscar = fechaBuscar;
	}
	public Integer getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}
	
	public List<SelectItem> getComboParadaAux() {
		return comboParadaAux;
	}
	public void setComboParadaAux(List<SelectItem> comboParadaAux) {
		this.comboParadaAux = comboParadaAux;
	}
	
	public List<SelectItem> getComboRecorridoAux() {
		return comboRecorridoAux;
	}
	public void setComboRecorridoAux(List<SelectItem> comboRecorridoAux) {
		this.comboRecorridoAux = comboRecorridoAux;
	}
	public Integer getIdRecorrido() {
		return idRecorrido;
	}
	public void setIdRecorrido(Integer idRecorrido) {
		this.idRecorrido = idRecorrido;
	}
	
	public Integer getIdParadaOrigen() {
		return idParadaOrigen;
	}
	public void setIdParadaOrigen(Integer idParadaOrigen) {
		this.idParadaOrigen = idParadaOrigen;
	}
	public Integer getIdParadaDestino() {
		return idParadaDestino;
	}
	public void setIdParadaDestino(Integer idParadaDestino) {
		this.idParadaDestino = idParadaDestino;
	}
	
	public List<Paradas> getListaParadaAux() {
		return listaParadaAux;
	}
	public void setListaParadaAux(List<Paradas> listaParadaAux) {
		this.listaParadaAux = listaParadaAux;
	}
	
	public Paradas getParadaOrigenAux() {
		return paradaOrigenAux;
	}
	public void setParadaOrigenAux(Paradas paradaOrigenAux) {
		this.paradaOrigenAux = paradaOrigenAux;
	}
	public Paradas getParadaDestinoAux() {
		return paradaDestinoAux;
	}
	public void setParadaDestinoAux(Paradas paradaDestinoAux) {
		this.paradaDestinoAux = paradaDestinoAux;
	}
	public void guardar(){
		Boleto boleto=new Boleto();
		boleto.setAsiento(getAsiento());
		boleto.setValor(getValor());
		boleto.setParadaOrigen(paradaOrigenAux);
		boleto.setParada(paradaDestinoAux);
		boletoService.guardar(boleto);
		mensaje("Guardado",boleto.getParada().getTerminal().getCiudad().getCiudad());
	}
	public void borrar(Boleto boleto){
		boletoService.borrar(boleto);
		mensaje("Borrado",boleto.getParada().getTerminal().getCiudad().getCiudad());
	}
	public List<Boleto> listaBoleto(){
		return boletoService.listaBoleto();
	}
	
	public void cargaComboParada(){
		comboParadaAux = paradasService.comboParadasPorRecorrido(getIdRecorrido());
		
	}
	
	public void cargaRecorrido(){
	//	paradaAux=paradasService.buscarPorId(getIdparadaDestino());
		Date desde =new Date();
		comboRecorridoAux = recorridosService.comboRecorridoPorFecha(desde, getFechaBuscar());
	}
	
	public List<SelectItem> comboCiudadDestino() {
		List<SelectItem> lista = new ArrayList<SelectItem>();
		if(listaParadaAux!=null){
		for (Paradas para : listaParadaAux) {
			if (para != null) {
				Integer nParadas = paradasService.numeroParada(para.getRecorrido().getId()).intValue();
				Integer paradaOrigen = para.getParada()+1;
				for (int i = paradaOrigen; i < nParadas; i++) {
					SelectItem aux = paradasService.ComboParadasCiudadNumero(para.getRecorrido().getId(), i);
					lista.add(aux);
				}
			}

		}
		}
		return lista;
	}
	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}
	public void cargaListaParadasPorCiudadFecha(){
		List<Paradas> listAux=paradasService.listaComboParadaPorFechaCiudad(getIdCiudad(), getFechaBuscar());
		List<Paradas> listCarga=new ArrayList<Paradas>();
		
//		listaParadaAux.clear();
		if(listAux!=null){
			for(Paradas para:listAux){
				Integer nParadas = paradasService.numeroParada(para.getRecorrido().getId()).intValue();
				Integer paradaOrigen = para.getParada()+1;
				for (int i = paradaOrigen; i <= nParadas; i++) {
					Paradas aux = paradasService.paradaCiudadNumero(para.getRecorrido().getId(), i);
					listCarga.add(aux);
				}
			}
			listaParadaAux=listCarga;
			
		}
	
		
	}
	public Paradas paradaPorCiudadRecorrido(Paradas parada){
		
		return paradasService.paradaPorCiudadRecorrido(getIdCiudad(), parada.getRecorrido().getId());
	}
	public void cargaVentaBoleto(Paradas paradaDestino){
		paradaDestinoAux=paradaDestino;
		paradaOrigenAux=paradasService.paradaPorCiudadRecorrido(getIdCiudad(), paradaDestino.getRecorrido().getId());
	}
	public String formatoHora(Integer hora){
		if(hora<10){
			return "0"+hora;
		}else{
		return hora.toString(); 
		}
	}
	  
}
