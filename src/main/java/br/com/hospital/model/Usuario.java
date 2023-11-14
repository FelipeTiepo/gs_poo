package br.com.hospital.model;

import br.com.hospital.util.CriptografiaUtils;

public class Usuario {

	private int idUsuario;
	private int idDados;
	private String nome;
	private String email;
	private String senha;
	private int tipoConta;
	
	public Usuario(int idUsuario, String nome, String email, String senha, int tipoConta) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.tipoConta = tipoConta;
	}
	
	public Usuario() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		try {
			this.senha = CriptografiaUtils.criptografar(senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}

	public int getIdDados() {
		return idDados;
	}

	public void setIdDados(int idDados) {
		this.idDados = idDados;
	}

}

