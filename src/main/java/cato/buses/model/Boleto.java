package cato.buses.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "boleto", catalog = "buses")
public class Boleto implements Serializable{

	  private Integer id;
	  private Paradas parada;
	  private Paradas paradaOrigen;
	  private Integer asiento;
	  private Integer valor;
	 
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_boleto", unique = true, nullable = false)  
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_parada_destino")
	public Paradas getParada() {
		return parada;
	}
	public void setParada(Paradas parada) {
		this.parada = parada;
	}
	@Column(name = "asiento", unique = true, nullable = false)
	public Integer getAsiento() {
		return asiento;
	}
	public void setAsiento(Integer asiento) {
		this.asiento = asiento;
	}
	@Column(name = "valor", unique = true, nullable = false)
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_parada_origen")
	public Paradas getParadaOrigen() {
		return paradaOrigen;
	}
	public void setParadaOrigen(Paradas paradaOrigen) {
		this.paradaOrigen = paradaOrigen;
	}
	  
	  
}
