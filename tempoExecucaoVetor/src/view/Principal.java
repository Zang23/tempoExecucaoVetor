package view;

import controller.*;

class Principal {
	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		
		int[] v1 = new int[1000];
		int[] v2 = new int[10000];
		int[] v3 = new int[100000];
		
		op.criaVetor(v1, v1.length);
		op.criaVetor(v2, v2.length);
		op.criaVetor(v3, v3.length);
	}
}
