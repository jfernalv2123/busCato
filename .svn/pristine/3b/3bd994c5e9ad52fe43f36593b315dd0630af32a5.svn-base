package municipalidad.pto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "foto", catalog = "pto")
public class Imagen implements java.io.Serializable{
	private Integer idImagen;
	private byte[] imagen;

	public Imagen(){
		
	}
	public Imagen(Integer idImagen,byte[] imagen){
		this.idImagen=idImagen;
		this.imagen=imagen;
		
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_foto", unique = true, nullable = false)
	public Integer getIdImagen() {
		return idImagen;
	}
	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}
	@Column(name = "foto")
	public byte[] getImagen() {
		return imagen;
	}
	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	
	
	

}
