package cato.buses.dao;

import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Terminal;

public interface TerminalDao {
	void Guardar(Terminal region);
	void actualizar(Terminal region);
	Terminal buscarPorId(int id);
	void borrar(Terminal region);
	List<Terminal> listaTerminal();
	List<SelectItem> comboTerminal();
	List<SelectItem> comboAndenesTerminal();
}
