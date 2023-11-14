package br.com.hospital.model;

public class Avaliacao {

	private int idAvaliacao;
	private int idTecnologia;
	private int notaUsuario;
	private String feedbackUsuario;
	
	public Avaliacao(int idAvaliacao, int notaUsuario, String feedbackUsuario, int idTecnologia) {
		super();
		this.idAvaliacao = idAvaliacao;
		this.notaUsuario = notaUsuario;
		this.feedbackUsuario = feedbackUsuario;
		this.idTecnologia = idTecnologia;
	}
	
	public Avaliacao() {
		super();
	}

	public int getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public int getNotaUsuario() {
		return notaUsuario;
	}

	public void setNotaUsuario(int notaUsuario) {
		this.notaUsuario = notaUsuario;
	}

	public String getFeedbackUsuario() {
		return feedbackUsuario;
	}

	public void setFeedbackUsuario(String feedbackUsuario) {
		this.feedbackUsuario = feedbackUsuario;
	}

	public int getIdTecnologia() {
		return idTecnologia;
	}

	public void setIdTecnologia(int idTecnologia) {
		this.idTecnologia = idTecnologia;
	}
	
	
	
}
