package municipalidad.pto.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.faces.model.SelectItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import municipalidad.pto.dao.CategoriaDao;
import municipalidad.pto.dao.GenericDao;
import municipalidad.pto.model.Categoria;
import municipalidad.pto.service.CategoriaService;

@Service("categoriaService")
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	CategoriaDao categoriaDao;
	@Autowired
	GenericDao genericDao;
	
	@Transactional
	public void persistCategoria(Categoria categoria) {
		genericDao.Guardar(categoria);
	}
	@Transactional
	public Categoria findCategoriaById(int id) {
		return categoriaDao.findCategoriaById(id);
	}
	@Transactional
	public void updateCategoria(Categoria categoria) {
		genericDao.update(categoria);

	}
	@Transactional
	public void deleteCategoria(Categoria categoria) {
		genericDao.delete(categoria);

	}
	@Transactional
	public List<Categoria> listaCategorias() {
		return categoriaDao.listaCategorias();
	}
	@Transactional
	public List<SelectItem> comboCategoria() {
		return categoriaDao.comboCategoria();
	}
}
