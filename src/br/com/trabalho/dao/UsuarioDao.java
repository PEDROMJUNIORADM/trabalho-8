package br.com.trabalho.dao;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.trabalho.model.Usuario;

@ApplicationScoped
@ManagedBean(name = "usuarioDao")
public class UsuarioDao extends GenericListDao<Usuario> {

	public UsuarioDao() {
		/**Calendar dataNascimento = Calendar.getInstance();

		Usuario usuario = new Usuario();
		usuario.setNomeReduzido("Pedro de Alcantara");
		usuario.setNomeCompleto("Pedro de Alcantara Francisco Antanio "
				+ "Joao Carlos Xavier de Paula Miguel Rafael Joaquim Jose "
				+ "Gonzaga Pascoal Cipriano Serafim de Braganca e Bourbon");
		usuario.setEmail("pedro.alcantara@gmail.com");
		usuario.setSenha("teste");
		usuario.setCpf("11111111111");
		dataNascimento.set(1798, 9, 12);
		usuario.setDataNascimento(dataNascimento.getTime());
		usuario.setSenha("teste");
		super.salvar(usuario);

		usuario = new Usuario();
		usuario.setNomeReduzido("Santos Dumont");
		usuario.setNomeCompleto("Alberto Santos Dumont");
		usuario.setEmail("santos.dumont@gmail.com");
		usuario.setSenha("teste");
		usuario.setCpf("22222222222");
		dataNascimento.set(1873, 6, 20);
		usuario.setDataNascimento(dataNascimento.getTime());
		super.salvar(usuario);

		usuario = new Usuario();
		usuario.setNomeReduzido("Isabel de Braganca");
		usuario.setNomeCompleto("Isabel Cristina Leopoldina Augusta "
				+ "Micaela Gabriela Rafaela Gonzaga de Braganca e Bourbon");
		usuario.setEmail("maria@gmail.com");
		usuario.setSenha("teste");
		usuario.setCpf("33333333333");
		dataNascimento.set(1846, 6, 29);
		usuario.setDataNascimento(dataNascimento.getTime());
		super.salvar(usuario); */
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
