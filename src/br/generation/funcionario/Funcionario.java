package br.generation.funcionario;

import java.util.Scanner;

public class Funcionario {
	
	private Scanner input = new Scanner(System.in);
	
	private String nome;
	private double vendas = 0;
	private double meta = 100;
	private double novaVenda;
	private double salario = 0;
	private double comissao = 0;
	private char codigo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getVendas() {
		return vendas;
	}
	public void setVendas(double vendas) {
		this.vendas = vendas;
	}
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
	public double getNovaVenda() {
		return novaVenda;
	}
	public void setNovaVenda(double novaVenda) {
		this.novaVenda = novaVenda;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public char getCodigo() {
		return codigo;
	}
	public void setCodigo(char codigo) {
		this.codigo = codigo;
	}	
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	void informacoes() {
		System.out.println("Nome do funcionário: " + nome
				+ "\nVendas no mês: R$ " + vendas
				+ "\nMeta de vendas do mês: R$ " + meta
				+ "\nSalario: R$ " + salario);
		System.out.println();
	}
	
	void vender() {
		System.out.println("Nova venda?");
		System.out.println("1-Sim \n2-Não");
		codigo = input.next().charAt(0);
		
		while(codigo != '1' && codigo != '2') {
			System.out.println("Codigo invalido, digite \n1-Sim \n2-não");
			codigo = input.next().charAt(0);
		}
		
		while(codigo == '1') {
			System.out.println("Quanto foi a venda?");
			novaVenda = input.nextDouble();
			vendas += novaVenda;
			
			System.out.println("Nova venda?");
			System.out.println("1-Sim \n2-Não");
			codigo = input.next().charAt(0);
			
			System.out.println();
		}
		if(codigo =='2') {
			System.out.println("Vendas do mês encerradas.\n");
		}		
	}
	
	void receberSalario() {
		if(meta <= vendas) {
			salario += comissao;
			
			System.out.println("Bonus: R$" + comissao);		
		}
		else {
			comissao = 0;
			System.out.println("Bonus: R$" + comissao);
			System.out.println();
			
		}
	}
}
