package controller;

import view.Main;

public class ThreadSapo extends Thread {
	
	private int puloMaximo;
	private int distMaxima;

	public ThreadSapo(int puloMaximo, int distMaxima) {
		this.puloMaximo = puloMaximo;
		this.distMaxima = distMaxima;
	}
	
	@Override
	public void run() {
		corrida();
	}

	private void corrida() {
		int distPercorrida = 0;
		int pulo = 0;
		int id = (int) threadId() - 19;
		while (distPercorrida < distMaxima) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			pulo = (int) (Math.random() * puloMaximo);
			distPercorrida = distPercorrida + pulo;
			System.out.println("Sapo " + id + " pulou " + pulo + " metros e percorreu um total de " + distPercorrida + " metros.");
		}
		
		switch (Main.posicao) {
		case 1:
			System.out.println("Sapo " + id + " chegou em primeiro!");
			Main.posicao++;
			break;
		case 2:
			System.out.println("Sapo " + id + " chegou em segundo!");
			Main.posicao++;
			break;
		case 3:
			System.out.println("Sapo " + id + " chegou em terceiro!");
			Main.posicao++;
			break;
		case 4:
			System.out.println("Sapo " + id + " chegou em quarto!");
			Main.posicao++;
			break;
		case 5:
			System.out.println("Sapo " + id + " chegou em quinto!");
			Main.posicao++;
			break;
		}
		
		
	}

}
