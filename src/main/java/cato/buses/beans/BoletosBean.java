package cato.buses.beans;

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

import cato.buses.model.Boleto;
import cato.buses.model.Paradas;
import cato.buses.model.Recorrido;
import cato.buses.service.BoletoService;
import cato.buses.service.ParadasService;
import cato.buses.service.RecorridosService;

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
	private Integer totalVentas;
	private Integer totalAsientos;
	private List<Boleto> listaBoletoAux;
	private Recorrido recorridoAux;
	private Date fechaDesde;
	private Date fechaHasta;
	private Integer totalVentasFecha;


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

	public Integer getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(Integer totalVentas) {
		this.totalVentas = totalVentas;
	}

	public Integer getTotalAsientos() {
		return totalAsientos;
	}

	public void setTotalAsientos(Integer totalAsientos) {
		this.totalAsientos = totalAsientos;
	}

	public Recorrido getRecorridoAux() {
		return recorridoAux;
	}

	public void setRecorridoAux(Recorrido recorridoAux) {
		this.recorridoAux = recorridoAux;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public Integer getTotalVentasFecha() {
		return totalVentasFecha;
	}

	public void setTotalVentasFecha(Integer totalVentasFecha) {
		this.totalVentasFecha = totalVentasFecha;
	}

	public void guardar() {
		Boleto boleto = new Boleto();
		boleto.setAsiento(getAsiento());
		boleto.setValor(getValor());
		boleto.setParadaOrigen(paradaOrigenAux);
		boleto.setParada(paradaDestinoAux);
		boletoService.guardar(boleto);
		setAsiento(null);
		setValor(null);
		mensaje("Guardado", boleto.getParada().getTerminal().getCiudad().getCiudad());
	}

	public void borrar(Boleto boleto) {
		boletoService.borrar(boleto);
		mensaje("Borrado", boleto.getParada().getTerminal().getCiudad().getCiudad());
	}

	public List<Boleto> listaBoleto() {
		return boletoService.listaBoleto();
	}

	public void cargaComboParada() {
		comboParadaAux = paradasService.comboParadasPorRecorrido(getIdRecorrido());

	}

	public List<Boleto> getListaBoletoAux() {
		return listaBoletoAux;
	}

	public void setListaBoletoAux(List<Boleto> listaBoletoAux) {
		this.listaBoletoAux = listaBoletoAux;
	}

	public void cargaRecorrido() {
		// paradaAux=paradasService.buscarPorId(getIdparadaDestino());
		Date desde = new Date();
		comboRecorridoAux = recorridosService.comboRecorridoPorFecha(desde, getFechaBuscar());
	}

	public List<SelectItem> comboCiudadDestino() {
		List<SelectItem> lista = new ArrayList<SelectItem>();
		if (listaParadaAux != null) {
			for (Paradas para : listaParadaAux) {
				if (para != null) {
					Integer nParadas = paradasService.numeroParada(para.getRecorrido().getId()).intValue();
					Integer paradaOrigen = para.getParada() + 1;
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

	public void cargaListaParadasPorCiudadFecha() {
		List<Paradas> listAux = paradasService.listaComboParadaPorFechaCiudad(getIdCiudad(), getFechaBuscar());
		List<Paradas> listCarga = new ArrayList<Paradas>();

		// listaParadaAux.clear();
		if (listAux != null) {
			for (Paradas para : listAux) {
				Integer nParadas = paradasService.numeroParada(para.getRecorrido().getId()).intValue();
				Integer paradaOrigen = para.getParada() + 1;
				for (int i = paradaOrigen; i <= nParadas; i++) {
					Paradas aux = paradasService.paradaCiudadNumero(para.getRecorrido().getId(), i);
					listCarga.add(aux);
				}
			}
			listaParadaAux = listCarga;

		}

	}

	public Paradas paradaPorCiudadRecorrido(Paradas parada) {

		return paradasService.paradaPorCiudadRecorrido(getIdCiudad(), parada.getRecorrido().getId());
	}

	public void cargaVentaBoleto(Paradas paradaDestino) {
		paradaDestinoAux = paradaDestino;
		paradaOrigenAux = paradasService.paradaPorCiudadRecorrido(getIdCiudad(), paradaDestino.getRecorrido().getId());
		// comboParadaAux;
		List<Boleto> listaBoletoAux = boletoService.asientosDisponiblesPorParadas(paradaOrigenAux, paradaDestinoAux);
		List<SelectItem> lista = new ArrayList<SelectItem>();
		List<Integer> listaAsietoAux= new ArrayList<Integer>();
		for (Integer i = 1; i <= paradaOrigenAux.getRecorrido().getBus().getAsientos(); i++) {
			listaAsietoAux.add(i);
		}
	
		for (Boleto bo : listaBoletoAux) {
			listaAsietoAux.remove(bo.getAsiento());
		}
		for(Integer i:listaAsietoAux){
			SelectItem sel = new SelectItem();
			sel.setLabel(i.toString());
			sel.setValue(i.toString());
			lista.add(sel);
		}
	
		comboParadaAux = lista;
	}
public void cargaBoletosYventasPorRecorrido(Paradas parada){
	totalVentas=boletoService.totalVentasRecorrido(parada.getRecorrido());
	totalAsientos=boletoService.asientosVendidos(parada.getRecorrido());
}
public Integer boletosVendidos(Recorrido recorrido){
	return boletoService.asientosVendidos(recorrido);
}
public Integer totalVentas(Recorrido recorrido){
	return boletoService.totalVentasRecorrido(recorrido);
}
	public String formatoHora(Integer hora) {
		if (hora < 10) {
			return "0" + hora;
		} else {
			return hora.toString();
		}
	}
public void cargaDetalleBoletos(Recorrido recorrido){
	listaBoletoAux=boletoService.listaBoletosPorRecorrido(recorrido);
	recorridoAux=recorrido;
}

public void cargaListaPorFecha(){
	listaBoletoAux=boletoService.listaBoletoPorFechas(getFechaDesde(), getFechaHasta(),getIdCiudadOrigen(),getIdCiudadDestino());
	setTotalVentasFecha(boletoService.ventasPorFecha(getFechaDesde(), getFechaHasta(),getIdCiudadOrigen(),getIdCiudadDestino()));
}

}
