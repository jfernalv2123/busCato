package cato.buses.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "recorrido", catalog = "buses")
public class Recorrido implements Serializable{
private Integer id;
private Terminal origen;
private Terminal destino;
private Bus bus;
private Date fechaSalida;
private Date fechaLlegada;

@Id
@GeneratedValue(strategy = IDENTITY)
@Column(name = "id_recorrido", unique = true, nullable = false)
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
@ManyToOne(cascade=CascadeType.MERGE)
@JoinColumn(name = "terminal_origen")
public Terminal getOrigen() {
	return origen;
}
public void setOrigen(Terminal origen) {
	this.origen = origen;
}
@ManyToOne(cascade=CascadeType.MERGE)
@JoinColumn(name = "terminal_destino")
public Terminal getDestino() {
	return destino;
}
public void setDestino(Terminal destino) {
	this.destino = destino;
}
@ManyToOne(cascade=CascadeType.MERGE)
@JoinColumn(name = "fk_bus")
public Bus getBus() {
	return bus;
}
public void setBus(Bus bus) {
	this.bus = bus;
}
@Column(name = "fecha_salida",  nullable = false)
public Date getFechaSalida() {
	return fechaSalida;
}
public void setFechaSalida(Date fechaSalida) {
	this.fechaSalida = fechaSalida;
}
@Column(name = "fecha_llegada",  nullable = false)
public Date getFechaLlegada() {
	return fechaLlegada;
}
public void setFechaLlegada(Date fechaLlegada) {
	this.fechaLlegada = fechaLlegada;
}


}
