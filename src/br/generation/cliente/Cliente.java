package br.generation.cliente;

import java.util.Scanner;

public class Cliente {
	
	Scanner input = new Scanner(System.in);
		
	private String nome;
	private String telefone;
	private String rg;
	private String cpf;
	private double saldo;
	private double valorDaCompra;
	private int compra;
	private int devolve;

	public void setInput(Scanner input) {
		this.input = input;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorDaCompra() {
		return valorDaCompra;
	}

	public void setValorDaCompra(double valorDaCompra) {
		this.valorDaCompra = valorDaCompra;
	}

	public int getCompra() {
		return compra;
	}

	public void setCompra(int compra) {
		this.compra = compra;
	}

	public int getDevolve() {
		return devolve;
	}

	public void setDevolve(int devolve) {
		this.devolve = devolve;
	}

	void consultarDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Telefone: " + telefone);
		System.out.println("RG: " + rg);
		System.out.println("CPF:" + cpf);
		System.out.println("Saldo: " + saldo);
		System.out.println("Valor da compra:" + valorDaCompra);
	}
	
	void comprar() {
		System.out.println("Efetuar compra? \n1-Sim\n2-Não");
		compra = input.nextInt();
		
		if(compra == 1) {
		saldo -= valorDaCompra;
		}
	}
	
	void devolver() {
		System.out.println("Efetuar devolução? \n1-Sim\n2-Não");
		devolve = input.nextInt();
		if(devolve == 1) {
		saldo += valorDaCompra;
		}
	}	
}
