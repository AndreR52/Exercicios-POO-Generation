package br.generation.funcionario;

import java.util.Scanner;

public class AcoesFuncionario {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f1.setNome("Alberto Roberto");
		f1.setVendas(0);
		f1.setMeta(1800);
		f1.setSalario(1100);
		f1.setNovaVenda(0);
		f1.setComissao(300);
		
		f2.setNome("Ana Joana");
		f2.setVendas(0);
		f2.setMeta(2300);
		f2.setSalario(1400);
		f2.setNovaVenda(0);
		f2.setComissao(500);
		
		System.out.println("Qual o funcionário?");
		System.out.println("1-" + f1.getNome());
		System.out.println("2-" + f2.getNome());
		char code = input.next().charAt(0);
		
		while(code != '1' && code != '2') {
			System.out.println("Código incorreto. Digite: \n1-" + f1.getNome()
				+ "\n2-" + f2.getNome());
				code = input.next().charAt(0);
				}
					
			if(code == '1') {
				f1.informacoes();
			
				f1.vender();
			
				f1.receberSalario();
				
				f1.informacoes();
			}
			
			else if(code == '2') {
				f2.informacoes();
				
				f2.vender();
			
				f2.receberSalario();
				
				f2.informacoes();
		}
		
		input.close();
	}
}
