package municipalidad.pto.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import municipalidad.pto.model.User;
import municipalidad.pto.service.UserService;

@ManagedBean
@SessionScoped
public class UserBean implements Serializable {

	@ManagedProperty(value = "#{userService}")
	UserService userService;

	private String name;
	private String surname;
	private Integer nivel;
	private String pass;
	private String newPass;
	private String repPass;
	private User user;
	private boolean sesion;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void persistUser() {
		User user = new User();
		user.setName(getName());
		user.setSurname(getSurname());
		user.setNivel(getNivel());
		user.setPass(getPass());
		userService.persistUser(user);
	}

	public List<User> listaUsuarios() {
		return userService.listaUsuarios();

	}

	public List<SelectItem> comboUser() {
		return userService.comboUser();
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isSesion() {
		return sesion;
	}

	public void setSesion(boolean sesion) {
		this.sesion = sesion;
	}

	public String getNewPass() {
		return newPass;
	}

	public void setNewPass(String newPass) {
		this.newPass = newPass;
	}

	public String getRepPass() {
		return repPass;
	}

	public void setRepPass(String repPass) {
		this.repPass = repPass;
	}

	public void mensaje(String titulo, String mensaje) {
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage(titulo, mensaje));
	}

	public String login() {
		User u = new User();
		u.setName(getName());
		u.setPass(getPass());
		boolean valida=false;
		String redireccion = null;
		
		valida=userService.sesionUser(getName(), getPass(), 1);
		if (valida) {
			user = userService.login(u);
			User usuario = userService.login(user);
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
			redireccion = "/admin/Articulo?faces-redirect=true";
		} else {
			redireccion = "index?faces-redirect=true";
			mensaje("Error", "Usuario o contraseña no valido");
		}
		sesion =valida;
		return redireccion;
	}
	public void verificarLogin(){
		try {
			FacesContext context = FacesContext.getCurrentInstance();
			User us=(User)context.getExternalContext().getSessionMap().get("usuario");
			if (us == null) {
                context.getExternalContext().redirect("../index.xhtml");
            }
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void cambioPass(){
		boolean valida=false;
		if(getPass().equals(user.getPass())){
			if(getNewPass().equals(getRepPass())){
				user.setPass(getNewPass());
				userService.updateUser(user);
				mensaje("Correcto", "La contraceña ha sido cambiada con exito");
			}else{
				mensaje("Error", "Las nuevas contraseñas no coincide");
			}
		}else{
			mensaje("Error", "contraseña no valida");
		}
	}

}
