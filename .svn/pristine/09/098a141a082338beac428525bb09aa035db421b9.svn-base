package municipalidad.pto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "informe_inventario", catalog = "pto")
public class InformeInventario implements Serializable {

	private Integer idInforme;
	private String dependencia;
	private Ubicacion ubicacion;
	private Date fecha;
	private String encargadoInventario;
	private String EncargadoDepartamento;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_informe_inventario", unique = true, nullable = false)
	public Integer getIdInforme() {
		return idInforme;
	}
	public void setIdInforme(Integer idInforme) {
		this.idInforme = idInforme;
	}
	@Column(name = "dependencia")
	public String getDependencia() {
		return dependencia;
	}
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name = "fk_ubicacion")
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Column(name = "fecha")
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@Column(name = "encargado_inventario")
	public String getEncargadoInventario() {
		return encargadoInventario;
	}
	public void setEncargadoInventario(String encargadoInventario) {
		this.encargadoInventario = encargadoInventario;
	}
	@Column(name = "encargado_departamento")
	public String getEncargadoDepartamento() {
		return EncargadoDepartamento;
	}
	public void setEncargadoDepartamento(String encargadoDepartamento) {
		EncargadoDepartamento = encargadoDepartamento;
	}
	
	
}
