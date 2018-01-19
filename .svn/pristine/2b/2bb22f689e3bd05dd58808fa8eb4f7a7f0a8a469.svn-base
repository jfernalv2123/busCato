package municipalidad.pto.model;

import static javax.persistence.GenerationType.IDENTITY;

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
@Table(name = "articulos", catalog = "pto")
public class Articulos implements java.io.Serializable{

	private Integer idArticulos;
	private String codigoAntiguo;
	private String articulo;
	private Estado estado;
	private AreaArticulo area;
	private Tipo tipo;
	private UnidadMedida unidadMedida;
	private String marca;
	private Ubicacion ubicacion;
	
	

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_articulos", unique = true, nullable = false)
	public Integer getIdArticulos() {
		return idArticulos;
	}
	public void setIdArticulos(Integer idArticulos) {
		this.idArticulos = idArticulos;
	}
	@Column(name = "codigo_antiguo", length = 50)
	public String getCodigoAntiguo() {
		return codigoAntiguo;
	}
	public void setCodigoAntiguo(String codigoAntiguo) {
		this.codigoAntiguo = codigoAntiguo;
	}
	@Column(name = "articulo", length = 50)
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "estado")
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "area")
	public AreaArticulo getArea() {
		return area;
	}
	public void setArea(AreaArticulo area) {
		this.area = area;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "tipo")
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "unidad_medida")
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	@Column(name = "marca", length = 50)
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_ubicacion")
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	
}
