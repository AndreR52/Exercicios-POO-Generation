package br.generation.aviao;

public class Aviao {
	
	private String modelo;
	private int numeroDeSerie;
	private double carga;
	private double altitude;
	private double velocidade;
	private double velocidadeDeDecolagem;
	private double velocidadeDePouso;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public void setNumeroDeSerie(int numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public double getCarga() {
		return carga;
	}
	public void setCarga(double carga) {
		this.carga = carga;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public double getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}	
	public double getVelocidadeDeDecolagem() {
		return velocidadeDeDecolagem;
	}
	public void setVelocidadeDeDecolagem(double velocidadeDeDecolagem) {
		this.velocidadeDeDecolagem = velocidadeDeDecolagem;
	}	
	public double getVelocidadeDePouso() {
		return velocidadeDePouso;
	}
	public void setVelocidadeDePouso(double velocidadeDePouso) {
		this.velocidadeDePouso = velocidadeDePouso;
	}
	
	void informacoes() {
		System.out.println("Modelo do avião: " + modelo);
		System.out.println("Capacidade de carga: " + carga + "Kg");
		System.out.println("Número de série: " + numeroDeSerie);
		System.out.println("Velocidade de decolagem: " + velocidadeDeDecolagem + "Km/h");
		System.out.println("Velocidade de pouso: " + velocidadeDePouso + "Km/h");
		System.out.println("Altitude atual: " + altitude + " pés");
		System.out.println("Velocidade atual " + velocidade + "Km/h");
	}
	
	void acelerar(double aceleracao) {
		velocidade += aceleracao;
	}
	
	void frear(double reducao) {
		velocidade -= reducao;
	}
	
	void decolar(double subida) {
		altitude += subida;
	}
	
	void pousar() {
			altitude = 0;
	}
	
	void subir(double subida) {
		altitude += subida;
	}
	
	void descer(double descida) {
		altitude -= descida;
	}
}
