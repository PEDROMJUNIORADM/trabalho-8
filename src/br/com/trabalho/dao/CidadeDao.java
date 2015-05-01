package br.com.trabalho.dao;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.com.trabalho.model.Cidade;

@ApplicationScoped
@ManagedBean(name = "cidadeDao")
public class CidadeDao extends GenericListDao<Cidade> {
	
	public void salvarCidade(Cidade cidade) {
		super.salvar(cidade);
	}

	public void excluirCidade(Cidade cidade) {
		super.excluir(cidade);
	}

	public Cidade selecionar(Cidade cidade) {
		return super.consultar(cidade);
	}

	public List<Cidade> listarCidades() {
		return super.listar();
	}

	public void salvarCidades(List<Cidade> cidades) {
		if (cidades != null) {
			for (Cidade cidade : cidades) {
				salvarCidade(cidade);
			}
		}
	}
}
