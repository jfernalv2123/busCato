package municipalidad.pto.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import municipalidad.pto.model.Terminal;

public interface TerminalDao {
	void Guardar(Terminal region);
	void actualizar(Terminal region);
	Terminal buscarPorId(int id);
	void borrar(Terminal region);
	List<Terminal> listaTerminal();
	List<SelectItem> comboTerminal();
	List<SelectItem> comboAndenesTerminal();
}
