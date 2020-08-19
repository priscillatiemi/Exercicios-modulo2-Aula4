package br.com.exercicio1;

public class Pato implements Voador{
	private int energia = 100;
	@Override
	public void voar() {
		energia-=5;
		if(energia>=0) {
			System.out.println("Estou voando como um pato: "+energia+" de energia.");
		}else {
			System.out.println("Nao tenho energia suficiente para voar: "+energia+" ne energia");
		}
	

}
}
