package br.com.exercicio1;

public class TorreDeControle {

	
	private Voador[] voadores;
	
	public TorreDeControle(Voador[] voadores) {
		this.voadores = voadores;
	}
	
	public void voemTodos() {
		for(int i = 0; i<this.voadores.length;i++) {
			voadores[i].voar();
		}
	}
}
	

