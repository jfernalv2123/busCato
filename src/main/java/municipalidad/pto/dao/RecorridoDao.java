package municipalidad.pto.dao;

import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Recorrido;

public interface RecorridoDao {
	void Guardar(Recorrido recorrido);
	void actualizar(Recorrido recorrido);
	Recorrido buscarPorId(int id);
	void borrar(Recorrido recorrido);
	List<Recorrido> listaRecorrido();
	List<SelectItem> comboRecorrido();
	List<Recorrido> recorridoPorFecha(Date desde,Date hasta);
	List<SelectItem> comboRecorridoPorFecha(Date desde,Date hasta);
}
