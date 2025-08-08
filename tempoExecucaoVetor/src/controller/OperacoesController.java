package controller;

public class OperacoesController {
	
	public void criaVetor(int[] vetor, int tamanho) {
		
		double tempoInicial = System.nanoTime();
		
		for(int i = 0; i < tamanho; i++) {
			vetor[i] = 0;
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) /  Math.pow(10, 9);
	
		System.out.println("vetor de " + tamanho + " posições ==> " + String.format("%.9f", tempoTotal) + "s");
	}
	
}
