package cato.buses.service;

import java.util.List;

import javax.faces.model.SelectItem;

import cato.buses.model.Terminal;

public interface TerminalService {

	void guardar(Terminal terminal);
	void Actualizar(Terminal terminal);
	void borrar(Terminal terminal);
	Terminal buscarPorId(int id);
	List<Terminal> listaTerminal();
	List<SelectItem> comboTerminal();
	List<SelectItem> comboAndenesTerminal();
}
