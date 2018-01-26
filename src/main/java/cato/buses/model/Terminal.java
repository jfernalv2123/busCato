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
@Table(name = "terminal", catalog = "buses")
public class Terminal implements Serializable{

	private Integer id;
	private String terminal;
	private Integer andenes;
	private Ciudad ciudad;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_terminal", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "terminal",  nullable = false)
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	@Column(name = "andenes",  nullable = false)
	public Integer getAndenes() {
		return andenes;
	}
	public void setAndenes(Integer andenes) {
		this.andenes = andenes;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_ciudad")
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	
}
