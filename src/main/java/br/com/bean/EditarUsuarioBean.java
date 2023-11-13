package br.com.bean;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.dao.DaoGeneric;
import br.com.model.Usuario;

@ManagedBean
@SessionScoped
public class EditarUsuarioBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private DaoGeneric<Usuario> daoGeneric = new DaoGeneric<>();
	private Usuario usuario;

	@PostConstruct
	public void init() {
		usuario = new Usuario();
	}

	public String carregarUsuarioParaEdicao(Long id) {

		usuario = daoGeneric.buscarPorId(Usuario.class, id);

		return "editarUsuario?faces-redirect=true";
	}

	public String salvarEdicao() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		try {
			Date dataNascimento = usuario.getDataNascimento();
			String dataFormatada = sdf.format(dataNascimento);
			Date dataParaSalvar = sdf.parse(dataFormatada);
			usuario.setDataNascimento(dataParaSalvar);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}

		daoGeneric.merge(usuario);
		return "usuarios?faces-redirect=true";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
