package municipalidad.pto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "direccion_proveedor", catalog = "pto")
public class DireccionProveedor implements Serializable{
	
	private Integer idDireccion;
	private String direccion;
	private Proveedor proveedor;
	private String ciudad;
	private String region;
	private String pais;
	public DireccionProveedor(){
		
	}
	public DireccionProveedor(String direccion, Proveedor proveedor) {
		this.direccion = direccion;
		this.proveedor = proveedor;
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_direccion_proveedor", unique = true, nullable = false)
	public Integer getIdDireccion() {
		return idDireccion;
	}
	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}
	@Column(name = "direccion", length = 200)
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_proveedor")
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	@Column(name = "ciudad", length = 60)
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	@Column(name = "region", length = 50)
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Column(name = "pais", length = 45)
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	

}
