package br.com.trabalho.managedbean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import br.com.trabalho.business.UsuarioBusiness;
import br.com.trabalho.business.UsuarioCadastradoException;
import br.com.trabalho.model.Usuario;

@ManagedBean
@RequestScoped
public class UsuarioBean {
	/** Referencia para a camada de regras de negocio */
	@ManagedProperty("#{usuarioBusiness}")
	private UsuarioBusiness usuarioBusiness;

	private String msgSucesso;

	/** Usuario a serusado no form. */
	private Usuario usuario = new Usuario();

	public UsuarioBusiness getUsuarioBusiness() {
		return usuarioBusiness;
	}

	public void setUsuarioBusiness(UsuarioBusiness usuarioBusiness) {
		this.usuarioBusiness = usuarioBusiness;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuarios() {
		return usuarioBusiness.listarUsuarios();
	}

	public void excluirUsuario() {
		usuarioBusiness.excluirUsuario(usuario);
	}

	public String novoUsuario() {
		usuario = new Usuario();
		return "usuario-editar.xhtml";
	}

	public String salvarUsuario() {
		try {
			usuarioBusiness.incluirUsuario(usuario);
			msgSucesso = "Usuário cadastrado com sucesso!";
			return "listar-usuarios.xhtml?faces-redirect=true";
		} catch (UsuarioCadastradoException e) {
			FacesMessage message = new FacesMessage();
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			message.setDetail(e.getMessage());
			FacesContext.getCurrentInstance().addMessage("usuarioForm", message);
			return null;
		}
		
	}

	public String getMsgSucesso() {
		return msgSucesso;
	}

	public void setMsgSucesso(String msgSucesso) {
		this.msgSucesso = msgSucesso;
	}
}