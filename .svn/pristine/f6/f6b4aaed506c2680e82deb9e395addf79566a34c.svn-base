package municipalidad.pto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "razon_social", catalog = "pto")
public class RazonSocial implements Serializable{
	
	private Integer idRazonSocial;
	private String razonSocial;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_razon_social", unique = true, nullable = false)
	public Integer getIdRazonSocial() {
		return idRazonSocial;
	}
	public void setIdRazonSocial(Integer idRazonSocial) {
		this.idRazonSocial = idRazonSocial;
	}
	@Column(name = "razon_social", length = 45)
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	

}
