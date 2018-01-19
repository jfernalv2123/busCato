package municipalidad.pto.dao;

import java.util.List;

import municipalidad.pto.model.Devolucion;

public interface DevolucionDao {
	Devolucion findDevolucionById(int id);
	List<Devolucion> listaDevolucion();
	List<Devolucion> listaDevolucionBySalida(int id);
	Long salidaDevolucion(int id,boolean perdida);
	Long salidaDevolucionBySalida(int id,boolean perdida);
	Long salidaDevolucionBySalidaAndArticulo(int idSalida,int idArticulo,boolean perdida);
}
