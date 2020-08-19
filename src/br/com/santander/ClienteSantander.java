package br.com.santander;

public class ClienteSantander {

	public static void main(String[] args) {
		BancoSantander cliente1= new BancoSantander(1234,"Silva","33333333", "555555", 20000.00,30000.00);
		cliente1.setSaque(100.00);
		cliente1.sacar(); 
		cliente1.sacarDinheiro();
		cliente1.depositar();
		
		System.out.println(cliente1.toString());
	}
}
