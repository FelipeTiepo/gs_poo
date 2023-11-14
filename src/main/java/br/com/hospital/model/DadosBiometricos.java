package br.com.hospital.model;

public class DadosBiometricos {

	private int idDados;
	private int idade;
	private int altura;
	private int peso;
	private String tipoSanguineo;
	private int cpf;
	private String convenioMedico;
	private int pressaoMaior;
	private int pressaoMenor;
	private String genero;
	
	public DadosBiometricos(int idDados, int idade, int altura, int peso, String tipoSanguineo, int cpf,
			String convenioMedico, int pressaoMaior, int pressaoMenor, String genero) {
		super();
		this.idDados = idDados;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.tipoSanguineo = tipoSanguineo;
		this.cpf = cpf;
		this.convenioMedico = convenioMedico;
		this.pressaoMaior = pressaoMaior;
		this.pressaoMenor = pressaoMenor;
		this.genero = genero;
	}

	public DadosBiometricos() {
		super();
	}
	
	public int getIdDados() {
		return idDados;
	}

	public void setIdDados(int idDados) {
		this.idDados = idDados;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getConvenioMedico() {
		return convenioMedico;
	}

	public void setConvenioMedico(String convenioMedico) {
		this.convenioMedico = convenioMedico;
	}

	public int getPressaoMaior() {
		return pressaoMaior;
	}

	public void setPressaoMaior(int pressaoMaior) {
		this.pressaoMaior = pressaoMaior;
	}

	public int getPressaoMenor() {
		return pressaoMenor;
	}

	public void setPressaoMenor(int pressaoMenor) {
		this.pressaoMenor = pressaoMenor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
