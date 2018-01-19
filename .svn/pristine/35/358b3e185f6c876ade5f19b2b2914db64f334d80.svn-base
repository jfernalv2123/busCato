package municipalidad.pto.service;

import java.util.List;

import municipalidad.pto.model.Devolucion;

public interface DevolucionService {

	Devolucion findDevolucionById(int id);
	List<Devolucion> listaDevolucion();
	List<Devolucion> listaDevolucionBySalida(int id);
	Long salidaDevolucion(int id,boolean perdida);
	void persistDevolucion(Devolucion devolucion);
	void updateDevolucion(Devolucion devolucion);
	void deleteDevolucion(Devolucion devolucion);
	Long salidaDevolucionBySalida(int id,boolean perdida);
	Long salidaDevolucionBySalidaAndArticulo(int idSalida,int idArticulo,boolean perdida);
}
