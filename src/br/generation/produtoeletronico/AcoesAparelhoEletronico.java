package br.generation.produtoeletronico;

import java.util.Scanner;

public class AcoesAparelhoEletronico {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ProdutoEletronico ap1 = new ProdutoEletronico();
		ProdutoEletronico ap2 = new ProdutoEletronico();
		
		ap1.setAparelho("Microondas");
		ap1.setPotencia(1200);
		ap1.setTensao(127);
		ap1.setCorrente(ap1.getPotencia() / ap1.getTensao());
		
		ap2.setAparelho("Televisão");
		ap2.setPotencia(300);
		ap2.setTensao(220);
		ap2.setCorrente(ap2.getPotencia() / ap2.getTensao());
		
		ap1.info();
		
		System.out.println("\nLigar " + ap1.getAparelho() + "?\n1-Sim\n2-Não");
		int codigo = input.nextInt();
		
		if(codigo == 1) {
			ap1.ligar();
		
			System.out.println("\nDesligar" + ap1.getAparelho() + "?\n1=Sim\n2-Não");
			codigo = input.nextInt();
			
			if(codigo == 1) {
				ap1.desligar();
			}		
		}
		ap2.info();
		
		System.out.println("\nLigar " + ap2.getAparelho() + "?\n1-Sim\n2-Não");
		codigo = input.nextInt();
		
		if(codigo == 1) {
			ap2.ligar();
		
			System.out.println("\nDesligar" + ap2.getAparelho() + "?\n1=Sim\n2-Não");
			codigo = input.nextInt();
			
			if(codigo == 1) {
				ap2.desligar();
			}		
		}
		input.close();		
	}
}
