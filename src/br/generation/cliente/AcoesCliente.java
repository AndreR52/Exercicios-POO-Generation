package br.generation.cliente;

public class AcoesCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		cliente1.setNome("Maria Aparecida");
		cliente1.setRg("12.345.678-9");
		cliente1.setCpf("123.456.789-12");
		cliente1.setTelefone("9 1234-5678");
		cliente1.setSaldo(500);
		cliente1.setValorDaCompra(250);
		
		cliente2.setNome("José da Silva");
		cliente2.setRg("98.765.432-1");
		cliente2.setCpf("987.654.321-98");
		cliente2.setTelefone("9 9876-5432");
		cliente2.setSaldo(1200);
		cliente2.setValorDaCompra(800);
		
		cliente1.consultarDados();		
		System.out.println();		
		cliente1.comprar();
		System.out.println();
		cliente1.devolver();
		System.out.println();
		cliente1.consultarDados();
		System.out.println();
		
		cliente2.consultarDados();
		System.out.println();
		cliente2.comprar();
		System.out.println();
		cliente2.devolver();
		System.out.println();
		cliente2.consultarDados();
	}

}
