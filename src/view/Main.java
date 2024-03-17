package view;

import controller.ThreadSapo;


public class Main {
	
	public static int posicao = 1;

	public static void main(String[] args) {
		int puloMaximo = 5;
		int distMaxima = 50;

		for (int i = 0; i < 5; i++) {
			ThreadSapo tSapo = new ThreadSapo(puloMaximo, distMaxima);
			tSapo.start();
		}

	}

}
