package br.generation.aviao;

import java.util.Scanner;

public class AcoesAviao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		Aviao av1 = new Aviao();
		Aviao av2 = new Aviao();
		
		av1.setModelo("Boeing");
		av1.setNumeroDeSerie(64528);
		av1.setCarga(50000);
		av1.setVelocidadeDeDecolagem(200);
		av1.setVelocidadeDePouso(270);
		av1.setVelocidade(0);
		av1.setAltitude(0);
		
		av2.setModelo("Airbus");
		av2.setNumeroDeSerie(54328);
		av2.setCarga(65000);
		av2.setVelocidadeDeDecolagem(260);
		av2.setVelocidadeDePouso(240);
		av2.setVelocidade(0);
		av2.setAltitude(0);
		
		System.out.println("Qual avião será utilizado?"
				+ "\n1-" + av1.getNumeroDeSerie()
				+ "\n2-" + av2.getNumeroDeSerie());
		char codigo = input.next().charAt(0);
		
		switch(codigo) {
		case '1':
			av1.informacoes();
			
			System.out.println("Acelerar quanto?\n");
			av1.acelerar(input.nextDouble());
			
			while(av1.getVelocidade() < av1.getVelocidadeDeDecolagem()) {
				System.out.println("Velocidade insuficiente para decolar, volte para o começo da pista e acelere mais.\n");
				av1.informacoes();
				System.out.println("Acelerar quanto?\n");
				av1.acelerar(input.nextDouble());
			}
			System.out.println("Decolando!! Subir quanto?\n");
			av1.decolar(input.nextDouble());
			
			av1.informacoes();
			System.out.println("Subir quanto?\n");
			av1.subir(input.nextDouble());
			
			av1.informacoes();
			System.out.println("Pleno voo. Acelerar quanto?\n");
			av1.acelerar(input.nextDouble());
			av1.informacoes();
			System.out.println("Proximo do pouso. Desacelerar quanto?");
			av1.frear(input.nextDouble());
			System.out.println("Descer quanto?\n");
			av1.descer(input.nextDouble());
			av1.informacoes();
			
			while(av1.getVelocidade() > av1.getVelocidadeDePouso()) {
				System.out.println("\nVelocidade alta demais para pousar, dê a volta e diminua a velocidade para pousar\n");
				av1.frear(input.nextDouble());
				av1.informacoes();
			}
			System.out.println("\nPousando!!");
			av1.pousar();
			av1.informacoes();
			System.out.println("\nPouso efetuado com sucesso!!!");		
			
		case '2':
			av2.informacoes();
			
			System.out.println("Acelerar quanto?\n");
			av2.acelerar(input.nextDouble());
			
			while(av2.getVelocidade() < av2.getVelocidadeDeDecolagem()) {
				System.out.println("Velocidade insuficiente para decolar, volte para o começo da pista e acelere mais.\n");
				av2.informacoes();
				System.out.println("Acelerar quanto?\n");
				av2.acelerar(input.nextDouble());
			}
			System.out.println("Decolando!! Subir quanto?\n");
			av2.decolar(input.nextDouble());
			
			av2.informacoes();
			System.out.println("Subir quanto?\n");
			av2.subir(input.nextDouble());
			
			av2.informacoes();
			System.out.println("Pleno voo. Acelerar quanto?\n");
			av2.acelerar(input.nextDouble());
			av2.informacoes();
			System.out.println("Proximo do pouso. Desacelerar quanto?");
			av2.frear(input.nextDouble());
			System.out.println("Descer quanto?\n");
			av2.descer(input.nextDouble());
			av2.informacoes();
			
			while(av2.getVelocidade() > av2.getVelocidadeDePouso()) {
				System.out.println("\nVelocidade alta demais para pousar, dê a volta e diminua a velocidade para pousar\n");
				av2.frear(input.nextDouble());
				av2.informacoes();
				
			}
			System.out.println("\nPousando!!");
			av2.pousar();
			av2.informacoes();
			System.out.println("\nPouso efetuado com sucesso!!!");
		
		}
		input.close();
	}
}
