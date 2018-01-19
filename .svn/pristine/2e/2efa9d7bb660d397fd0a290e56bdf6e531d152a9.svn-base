package municipalidad.pto.service;

import java.util.List;

import municipalidad.pto.model.RelIngresoArticulo;
import municipalidad.pto.model.RelSalidaArticulo;

public interface RelSalidaArticuloService {
	void persistRelSalidaArticulo(RelSalidaArticulo relIngresoArticulo);
	RelSalidaArticulo findRelSalidaArticuloById(int id);
	void updateRelSalidaArticulo(RelSalidaArticulo relSalidaArticulo);
	void deleteRelSalidaArticulo(RelSalidaArticulo relSalidaArticulo);
	List<RelSalidaArticulo> listaRelSalidaArticulo();
	List<RelSalidaArticulo> listaRelSalidaArticuloByIngreso(int id);
	Long salidaArticulo(int id);
	Long salidaArticuloBySalida(int id);
	Long salidaArticuloBySalidaAndArticulo(int idSalida,int idArticulo);
}
