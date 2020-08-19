package br.com.exercicio1;

public class SuperHomem implements Voador {
		private int xp = 0;
	@Override
	
	public void voar() {
		xp+=3;	
		System.out.println("Estou voando como um campeao: "+xp+" de experiencia");
	}
}
