package br.com.trabalho.lista;

import java.util.ArrayList;
import java.util.List;

import br.com.trabalho.model.Usuario;

public class ListUsuariosFactory {
	private static List<Usuario> listaUsuarios;

	public synchronized static List<Usuario> getListaUsuario() {
		if (listaUsuarios == null) {
			listaUsuarios = new ArrayList<Usuario>();
		}
		return listaUsuarios;
	}
}
