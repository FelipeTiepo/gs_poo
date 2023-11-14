package br.com.hospital.model;

import java.util.Calendar;

public class RegistroConsulta {

	private int idRegistroConsulta;
	private int idTecnologia;
	private Calendar dataRegistroConsulta;
	
	public RegistroConsulta(int idRegistroConsulta, int idTecnologia, Calendar dataRegistroConsulta) {
		super();
		this.idRegistroConsulta = idRegistroConsulta;
		this.idTecnologia = idTecnologia;
		this.dataRegistroConsulta = dataRegistroConsulta;
	}
	
	public RegistroConsulta() {
		super();
	}

	public int getIdRegistroConsulta() {
		return idRegistroConsulta;
	}

	public void setIdRegistroConsulta(int idRegistroConsulta) {
		this.idRegistroConsulta = idRegistroConsulta;
	}

	public Calendar getDataRegistroConsulta() {
		return dataRegistroConsulta;
	}

	public void setDataRegistroConsulta(Calendar dataRegistroConsulta) {
		this.dataRegistroConsulta = dataRegistroConsulta;
	}

	public int getIdTecnologia() {
		return idTecnologia;
	}

	public void setIdTecnologia(int idTecnologia) {
		this.idTecnologia = idTecnologia;
	}
	
	
	
}
