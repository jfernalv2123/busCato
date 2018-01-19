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
@Table(name = "imagen_articulo", catalog = "pto")
public class FotoArticulo implements Serializable{
	
	private Integer idFotoArticulo;
	private Articulos articulo;
	private byte[] foto;
	public FotoArticulo(){
		
	}
	public FotoArticulo(Articulos articulo, byte[] foto) {
		this.articulo = articulo;
		this.foto = foto;
	}
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_imagen_articulo", unique = true, nullable = false)
	public Integer getIdFotoArticulo() {
		return idFotoArticulo;
	}
	public void setIdFotoArticulo(Integer idFotoArticulo) {
		this.idFotoArticulo = idFotoArticulo;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_articulo")
	public Articulos getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulos articulo) {
		this.articulo = articulo;
	}
	@Column(name = "imagen")
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	

}
