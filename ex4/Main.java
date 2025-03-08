package view;

import controller.Sapo;

public class Main {
	public static void main(String[] args) {
		
		int pulo = 0;
		final int distancia = 100;
		
		
		Sapo sapo1 = new Sapo(pulo, distancia, 1);
		Sapo sapo2 = new Sapo(pulo, distancia, 2);
		Sapo sapo3 = new Sapo(pulo, distancia, 3);
		Sapo sapo4 = new Sapo(pulo, distancia, 4);
		Sapo sapo5 = new Sapo(pulo, distancia, 5);
		sapo1.start();
		sapo2.start();
		sapo3.start();
		sapo4.start();
		sapo5.start();
		
		
	}
}
