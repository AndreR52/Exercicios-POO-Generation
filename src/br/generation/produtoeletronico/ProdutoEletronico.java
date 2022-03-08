package br.generation.produtoeletronico;

public class ProdutoEletronico {
	
	private String aparelho;
	private int tensao;
	private int potencia;
	private double corrente;
	
	public String getAparelho() {
		return aparelho;
	}
	
	public void setAparelho(String aparelho) {
		this.aparelho = aparelho;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public double getCorrente() {
		return corrente;
	}
	public void setCorrente(double corrente) {
		this.corrente = corrente;
	}
	
	void info() {
		System.out.println("Aparelho: " + aparelho
				+ "\nTensão: " + tensao + " volts"
				+ "\npotencia: " + potencia + " watts"
				+ "\ncorrente: " + corrente + " amperes");
	}
	
	void ligar() {
		System.out.println(aparelho + " ligado!!!\n");
	}
	
	void desligar() {
		System.out.println(aparelho + " desligado!!\n");
	}
	
	

}
