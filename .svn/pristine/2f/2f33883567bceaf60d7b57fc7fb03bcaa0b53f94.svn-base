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
@Table(name = "proveedor", catalog = "pto")
public class Proveedor implements Serializable{

	private Integer idProveedor;
	private String proveedor;
	private Categoria categoria;
	private RazonSocial razonSocial;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_proveedor", unique = true, nullable = false)
	public Integer getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}
	@Column(name = "proveedor", length = 150)
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "categoria")
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_razon_socia")
	public RazonSocial getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(RazonSocial razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	
	
}
