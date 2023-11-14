package br.com.hospital.model;

public class Tecnologias {

	private int idTecnologias;
	private String exameNome;
	private String exameDescricao;
	
	public Tecnologias(int idTecnologias, String exameNome, String exameDescricao) {
		super();
		this.idTecnologias = idTecnologias;
		this.exameNome = exameNome;
		this.exameDescricao = exameDescricao;
	}
	
	public Tecnologias() {
		super();
	}

	public int getIdTecnologias() {
		return idTecnologias;
	}

	public void setIdTecnologias(int idTecnologias) {
		this.idTecnologias = idTecnologias;
	}

	public String getExameNome() {
		return exameNome;
	}

	public void setExameNome(String exameNome) {
		this.exameNome = exameNome;
	}

	public String getExameDescricao() {
		return exameDescricao;
	}

	public void setExameDescricao(String exameDescricao) {
		this.exameDescricao = exameDescricao;
	}
	
	
	
}
