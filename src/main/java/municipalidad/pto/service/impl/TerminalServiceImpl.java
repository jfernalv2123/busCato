package municipalidad.pto.service.impl;

import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import municipalidad.pto.dao.TerminalDao;

import municipalidad.pto.model.Terminal;
import municipalidad.pto.service.TerminalService;

@Service("terminalService")
public class TerminalServiceImpl implements TerminalService{

	@Autowired
	TerminalDao terminalDao;
	
	@Transactional
	public void guardar(Terminal terminal){
		terminalDao.Guardar(terminal);
	}
	@Transactional
	public void Actualizar(Terminal terminal){
		terminalDao.actualizar(terminal);
	}
	@Transactional
	public void borrar(Terminal terminal){
		terminalDao.borrar(terminal);
	}
	@Transactional
	public Terminal buscarPorId(int id){
		return terminalDao.buscarPorId(id);
	}
	@Transactional
	public List<Terminal> listaTerminal(){
		return terminalDao.listaTerminal();
	}
	@Transactional
	public List<SelectItem> comboTerminal(){
		return terminalDao.comboTerminal();
	}
	@Transactional
	public List<SelectItem> comboAndenesTerminal(){
		return terminalDao.comboAndenesTerminal();
	}
}
