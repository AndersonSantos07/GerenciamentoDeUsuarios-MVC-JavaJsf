package br.com.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.dao.DaoGeneric;
import br.com.model.Usuario;

@RequestScoped
@ManagedBean(name = "usuarioBean")
public class UsuarioBean {

	private Usuario pessoa = new Usuario();
	private DaoGeneric<Usuario> daoGeneric = new DaoGeneric<Usuario>();
	private List<Usuario> pessoas = new ArrayList<Usuario>();

	public String salvar() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {

			Date dataNascimento = pessoa.getDataNascimento();

			String dataFormatada = sdf.format(dataNascimento);

			Date dataParaSalvar = sdf.parse(dataFormatada);

			pessoa.setDataNascimento(dataParaSalvar);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}

		daoGeneric.salvar(pessoa);
		carregarPessoas();
		novo();
		return "usuarios";
	}

	public String novo() {

		pessoa = new Usuario();
		return "";
	}

	public String deletePorId(Long id) {
		daoGeneric.deletePorId(id);
		carregarPessoas();
		return "usuarios?faces-redirect=true";
	}

	@PostConstruct
	public void carregarPessoas() {

		pessoas = daoGeneric.getListEntity(Usuario.class);

	}

	public Usuario getPessoa() {
		return pessoa;
	}

	public void setPessoa(Usuario pessoa) {
		this.pessoa = pessoa;
	}

	public DaoGeneric<Usuario> getDaoGeneric() {
		return daoGeneric;
	}

	public void setDaoGeneric(DaoGeneric<Usuario> daoGeneric) {
		this.daoGeneric = daoGeneric;
	}

	public List<Usuario> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Usuario> pessoas) {
		this.pessoas = pessoas;
	}

}
