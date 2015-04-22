package br.com.trabalho.controler;

import java.util.List;

import br.com.trabalho.lista.ListUsuariosFactory;
import br.com.trabalho.model.Usuario;

public class UsuarioControler {

	private static int id = 0;

	public static void incluir(Usuario usuario) {
		usuario.setId(id);
		ListUsuariosFactory.getListaUsuario().add(usuario);
		id++;
	}

	public static void remover(int id) {
		Usuario usuario = consultar(id);
		ListUsuariosFactory.getListaUsuario().remove(usuario);
	}

	public static Usuario consultar(int id) {
		Usuario usuario = null;
		for (int i = 0; i < ListUsuariosFactory.getListaUsuario().size(); i++) {
			if (id == ListUsuariosFactory.getListaUsuario().get(i).getId()) {
				usuario = ListUsuariosFactory.getListaUsuario().get(i);
				break;
			}
		}
		return usuario;
	}

	public static List<Usuario> listar() {
		return ListUsuariosFactory.getListaUsuario();
	}
}
