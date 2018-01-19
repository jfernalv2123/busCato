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
@Table(name = "rel_salida_articulo", catalog = "pto")
public class RelSalidaArticulo implements Serializable{
	
	private Integer idRelSalidaArticulo;
	private Articulos articulo;
	private Salida salida;
	private Integer cantidad;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_rel_salida_articulo", unique = true, nullable = false)
	public Integer getIdRelSalidaArticulo() {
		return idRelSalidaArticulo;
	}
	public void setIdRelSalidaArticulo(Integer idRelSalidaArticulo) {
		this.idRelSalidaArticulo = idRelSalidaArticulo;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_articulo")
	public Articulos getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulos articulo) {
		this.articulo = articulo;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_salida")
	public Salida getSalida() {
		return salida;
	}
	public void setSalida(Salida salida) {
		this.salida = salida;
	}
	@Column(name = "cantidad")
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
