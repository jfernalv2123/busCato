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
@Table(name = "mail", catalog = "pto")
public class Mail implements Serializable{
	
	private Integer idMail;
	private String mail;
	private Proveedor proveedor;
	public Mail(){
		
	}
	public Mail(String mail, Proveedor proveedor) {
		this.mail = mail;
		this.proveedor = proveedor;
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_mail", unique = true, nullable = false)
	public Integer getIdMail() {
		return idMail;
	}
	public void setIdMail(Integer idMail) {
		this.idMail = idMail;
	}
	@Column(name = "mail", length = 100)
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_proveedor")
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	

}
