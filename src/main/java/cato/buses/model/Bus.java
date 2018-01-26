package cato.buses.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bus", catalog = "buses")
public class Bus implements Serializable{

	private Integer id;
	private String patente;
	private Integer asientos;
	private Integer pisos;
	private Integer wc;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_bus", unique = true, nullable = false)
	public Integer getBus() {
		return id;
	}
	public void setBus(Integer bus) {
		this.id = bus;
	}
	@Column(name = "patente", unique = true, nullable = false)
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	@Column(name = "asientos", nullable = false)
	public Integer getAsientos() {
		return asientos;
	}
	public void setAsientos(Integer asientos) {
		this.asientos = asientos;
	}
	@Column(name = "pisos", nullable = false)
	public Integer getPisos() {
		return pisos;
	}
	public void setPisos(Integer pisos) {
		this.pisos = pisos;
	}
	@Column(name = "wc", nullable = false)
	public Integer getWc() {
		return wc;
	}
	public void setWc(Integer wc) {
		this.wc = wc;
	}
	
	
}
