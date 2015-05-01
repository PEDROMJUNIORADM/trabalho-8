package br.com.trabalho.dao;

import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.trabalho.model.Usuario;

@ApplicationScoped
@ManagedBean(name = "usuarioDao")
public class UsuarioDao extends GenericListDao<Usuario> {

	public UsuarioDao() {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(2015, 1, 1);

		Usuario usuario = new Usuario();

		usuario.setNomeReduzido("Admin");
		usuario.setNomeCompleto("Administrador do Sistema");
		usuario.setEmail("admin@admin.com");
		usuario.setSenha("admin");
		usuario.setCpf("03755871793");
		usuario.setDataNascimento(dataNascimento.getTime());

		super.salvar(usuario);
	}

	public void salvarUsuario(Usuario usuario) {
		super.salvar(usuario);
	}

	public void excluirUsuario(Usuario usuario) {
		super.excluir(usuario);
	}

	public Usuario selecionarUsuario(Usuario usuario) {
		return super.consultar(usuario);
	}

	public List<Usuario> listarUsuarios() {
		return super.listar();
	}

	public Usuario consultarUsuarioCPF(String cpf) {
		List<Usuario> usuarios = listarUsuarios();
		for (Usuario usuarioLista : usuarios) {
			if (usuarioLista.getCpf().equals(cpf)) {
				return usuarioLista;
			}
		}
		return null;
	}
}
