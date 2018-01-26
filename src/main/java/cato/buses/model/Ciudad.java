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
@Table(name = "ciudad", catalog = "buses")
public class Ciudad implements Serializable{

	private Integer id;
	private String ciudad;
	private RegionChile region;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_ciudad", unique = true, nullable = false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name = "ciudad", unique = true, nullable = false)
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "region")
	public RegionChile getRegion() {
		return region;
	}
	public void setRegion(RegionChile region) {
		this.region = region;
	}
	
	
}
