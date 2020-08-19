package br.com.exercicio1;

public class Main {

	public static void main(String[] args) {
		Pato pato = new Pato();
		Aviao aviao = new Aviao();
		SuperHomem superHomem = new SuperHomem();
		Voador[] voadores = {pato, aviao, superHomem};
		TorreDeControle torre = new TorreDeControle(voadores);
		torre.voemTodos();
		System.out.println();
		
	}
	
}
