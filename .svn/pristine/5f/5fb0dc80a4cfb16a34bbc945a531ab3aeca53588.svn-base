package municipalidad.pto.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipo", catalog = "pto")
public class Tipo implements Serializable {
private Integer idTipo;
private String tipo;

@Id
@GeneratedValue(strategy = IDENTITY)
@Column(name = "id_tipo", unique = true, nullable = false)
public Integer getIdTipo() {
	return idTipo;
}
public void setIdTipo(Integer idTipo) {
	this.idTipo = idTipo;
}
@Column(name = "tipocol", length = 45)
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}


}
