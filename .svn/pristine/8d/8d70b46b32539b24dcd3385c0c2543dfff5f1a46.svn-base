package municipalidad.pto.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.primefaces.event.RowEditEvent;

import municipalidad.pto.model.Categoria;
import municipalidad.pto.model.UnidadMedida;
import municipalidad.pto.service.CategoriaService;

@ManagedBean
@SessionScoped
public class CategoriaBean implements Serializable {

	@ManagedProperty(value = "#{categoriaService}")
	CategoriaService categoriaService;

	private Integer idCategoria;
	private String categoria;

	public void setCategoriaService(CategoriaService categoriaService) {
		this.categoriaService = categoriaService;
	}

	public Integer getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Integer idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void persistCategoria() {
		Categoria categoria = new Categoria();
		FacesContext context = FacesContext.getCurrentInstance();
		if(getCategoria().equals("")){
			context.addMessage(null, new FacesMessage("Error",  "debe ingresar una Categoria") );
		}else{
			categoria.setCategoria(getCategoria());
			categoriaService.persistCategoria(categoria);
			context.addMessage(null, new FacesMessage("Guardado",  getCategoria()) );
		}
		setCategoria(null);
		
	}

	public Categoria findCategoriaById(int id) {
		return categoriaService.findCategoriaById(id);
	}

	

	public void deleteCategoria(int id) {
		Categoria categoria = categoriaService.findCategoriaById(id);
		categoriaService.deleteCategoria(categoria);

	}

	public List<Categoria> listaCategorias() {
		return categoriaService.listaCategorias();
	}
	public List<SelectItem> listaCategoriasString(){
		List<SelectItem> aux=new ArrayList<SelectItem>();
		SelectItem i=new SelectItem();
		i.setLabel(String.valueOf("Seleccione"));
		i.setValue(String.valueOf(""));
		aux.add(i);
		for(Categoria c:categoriaService.listaCategorias()){
			SelectItem item=new SelectItem();
			item.setLabel(String.valueOf(c.getCategoria()));
			item.setValue(String.valueOf(c.getCategoria()));
			aux.add(item);
		}
		return  aux;
	}
	

	public List<SelectItem> comboCategoria() {
		return categoriaService.comboCategoria();
	}
	public void onRowEdit(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Editado", ((Categoria) event.getObject()).getCategoria() + " a " + getCategoria());
		FacesContext.getCurrentInstance().addMessage(null, msg);
		Categoria cat = (Categoria) event.getObject();
		cat.setCategoria(getCategoria());
		categoriaService.updateCategoria(cat);
		setCategoria(null);
	}

	public void onRowCancel(RowEditEvent event) {
		FacesMessage msg = new FacesMessage("Cancelada", ((Categoria) event.getObject()).getCategoria());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}
}
