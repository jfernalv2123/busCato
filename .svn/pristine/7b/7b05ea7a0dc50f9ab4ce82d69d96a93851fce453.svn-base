package municipalidad.pto.model;

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
@Table(name = "devolucion", catalog = "pto")
public class Devolucion implements Serializable{

	private Integer idDevolucion;
	private Salida salida;
	private Articulos articulo;
	private Integer cantidad;
	private String observacion;
	private boolean perdida;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_devolucion", unique = true, nullable = false)
	public Integer getIdDevolucion() {
		return idDevolucion;
	}
	public void setIdDevolucion(Integer idDevolucion) {
		this.idDevolucion = idDevolucion;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_salida")
	public Salida getSalida() {
		return salida;
	}
	public void setSalida(Salida salida) {
		this.salida = salida;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_articulo")
	public Articulos getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulos articulo) {
		this.articulo = articulo;
	}
	@Column(name = "cantidad")
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Column(name = "observacion")
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	@Column(name = "perdida")
	public boolean isPerdida() {
		return perdida;
	}
	public void setPerdida(boolean perdida) {
		this.perdida = perdida;
	}
	
	
}
