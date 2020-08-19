package br.com.santander;

public abstract class Pessoa {
	
	private int numeroCliente;
	private String sobrenome;
	private String rg;
	private String cpf;
	
	public Pessoa(int numeroCliente, String sobrenome, String rg, String cpf) {
		this.numeroCliente=numeroCliente;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
