package municipalidad.pto.beans;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;

import municipalidad.pto.model.FotoArticulo;
import municipalidad.pto.objetos.GaleriaArticulo;
import municipalidad.pto.service.ArticulosService;
import municipalidad.pto.service.FotoArticuloService;

@ManagedBean
@SessionScoped
public class FotoArticuloBean {

	@ManagedProperty(value = "#{fotoArticuloService}")
	FotoArticuloService fotoArticuloService;
	@ManagedProperty(value = "#{articulosService}")
	ArticulosService articulosService;
	
	private UploadedFile file;
	private Integer id;
	private Integer idFoto;
	private String articulo;
	public UploadedFile getFile() {
		return file;
	}
	public void setFile(UploadedFile file) {
		this.file = file;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setFotoArticuloService(FotoArticuloService fotoArticuloService) {
		this.fotoArticuloService = fotoArticuloService;
	}
	public void setArticulosService(ArticulosService articulosService) {
		this.articulosService = articulosService;
	}
	public void idArticulo(int id){
		this.id = id;
	}
	
	public String getArticulo() {
		return articulo;
	}
	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	public void persistImagen(FileUploadEvent event)
	{
		FotoArticulo fotoArticulo = new FotoArticulo();
		UploadedFile fil=event.getFile();
		if (fil != null) {
			FacesMessage message = new FacesMessage("Succesful", fil.getFileName() + " is uploaded.");
			FacesContext.getCurrentInstance().addMessage(null, message);
			
			int fotoSize=(int)fil.getSize();
			 byte[] imag=new byte[fotoSize];
			 try {
				imag=convertirTobyteArray(fil.getInputstream());
				fotoArticulo.setFoto(imag);
				fotoArticulo.setArticulo(articulosService.findArticuloById(id));
				fotoArticuloService.persistFono(fotoArticulo);
			} catch (IOException e) {
				// TODO Bloque catch generado automáticamente
				e.printStackTrace();
			}
		}else{
			
			FacesMessage message = new FacesMessage("ERROR");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		
		
		
	}

	private byte[] convertirTobyteArray(InputStream is) throws IOException {
		byte[] bytes = null;
		if (is != null) {
			bytes = new byte[is.available()];
			is.read(bytes);
		}
		return bytes;
	}
	//funcion para mostrar imagen 
	
	
	public StreamedContent imageById(int id) {
		 FacesContext context = FacesContext.getCurrentInstance();
		
		 if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			
	            return new DefaultStreamedContent();
	        }else{
	        	FotoArticulo fotoArticulo = new FotoArticulo();
	        	fotoArticulo=fotoArticuloService.findFotoArticuloById(id);
	        	return new DefaultStreamedContent(new ByteArrayInputStream(fotoArticulo.getFoto()));
	        }

	}
	public void asignarId(int idf){
		this.idFoto = idf;
	}
	public StreamedContent imageMostrar() {
		 FacesContext context = FacesContext.getCurrentInstance();
		
		 if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			
	            return new DefaultStreamedContent();
	        }else{
	        	FotoArticulo fotoArticulo = new FotoArticulo();
	        	fotoArticulo=fotoArticuloService.findFotoArticuloById(this.idFoto);
	        	return new DefaultStreamedContent(new ByteArrayInputStream(fotoArticulo.getFoto()));
	        }

	}
	public StreamedContent imageByIdFotoArt(FotoArticulo fa) {
		FacesContext context = FacesContext.getCurrentInstance();

		if (context.getCurrentPhaseId() == PhaseId.RENDER_RESPONSE) {
			return new DefaultStreamedContent();
			
		} else {
			
			return new DefaultStreamedContent((new ByteArrayInputStream(fa.getFoto())));
		}

	}

	public List<GaleriaArticulo> galeriaByArticulo(int id){
		List<GaleriaArticulo> aux= new ArrayList<GaleriaArticulo>();
		for(FotoArticulo fa:fotoArticuloService.listaFotosByArticulo(id)){
			GaleriaArticulo galeria = new GaleriaArticulo();
			galeria.setArticulo(fa.getArticulo());
			galeria.setIdFoto(fa.getIdFotoArticulo());
			InputStream is = new ByteArrayInputStream(fa.getFoto());
		    StreamedContent image = new DefaultStreamedContent(is,"image/png");
			galeria.setFoto(image);
			aux.add(galeria);
		}
		return aux;
	}
	public List<FotoArticulo> listaFotosByArticulo(int id){
		return fotoArticuloService.listaFotosByArticulo(id);
	}
	public void borrar(int id){
		
		try{
			fotoArticuloService.deleteFotoArticulo(fotoArticuloService.findFotoArticuloById(id));
			FacesMessage message = new FacesMessage("Borrado");
			FacesContext.getCurrentInstance().addMessage(null, message);
		}catch (Exception e) {
			
			FacesMessage message = new FacesMessage("ERROR");	
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		
	}
}
