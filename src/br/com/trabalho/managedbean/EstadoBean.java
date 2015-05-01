package br.com.trabalho.managedbean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import br.com.trabalho.business.EstadoBusiness;
import br.com.trabalho.model.Estado;

@ManagedBean
@RequestScoped
public class EstadoBean {
	@ManagedProperty("#{estadoBusiness}")
	private EstadoBusiness estadoBusiness;
	
	private Estado estado = new Estado();

	public EstadoBusiness getEstadoBusiness() {
		return estadoBusiness;
	}

	public void setEstadoBusiness(EstadoBusiness estadoBusiness) {
		this.estadoBusiness = estadoBusiness;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public List<Estado> getListaEstados() {
		return estadoBusiness.listarEstados();
	}
	
	public void excluirEstado(){
		estadoBusiness.excluirEstado(estado);
	}
	
	public String novoEstado() {
		estado = new Estado();
		return "estado-editar.xhtml";
	}
}
