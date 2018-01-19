package municipalidad.pto.model;

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
@Table(name = "paradas", catalog = "buses")
public class Paradas implements Serializable{

	private Integer id;
	private Recorrido recorrido;
	private Terminal terminal;
	private Date llegada;
	private Integer parada;
	private Integer anden;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_paradas", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_recorrido")
	public Recorrido getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(Recorrido recorrido) {
		this.recorrido = recorrido;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_terminal")
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	@Column(name = "llegada")
	public Date getLlegada() {
		return llegada;
	}
	public void setLlegada(Date llegada) {
		this.llegada = llegada;
	}
	@Column(name = "parada")
	public Integer getParada() {
		return parada;
	}
	public void setParada(Integer parada) {
		this.parada = parada;
	}
	@Column(name = "anden")
	public Integer getAnden() {
		return anden;
	}
	public void setAnden(Integer anden) {
		this.anden = anden;
	}
	
	
}
