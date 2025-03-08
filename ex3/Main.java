package view;

import controller.ThreadController;

public class Main {
	public static void main(String[] args) {
		int[] vetor = new int[10000];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = (int) ((Math.random() * 100) + 1);
		}
		
		ThreadController t = new ThreadController(1, vetor);
		ThreadController t2 = new ThreadController(2, vetor);
		t.start();
		t2.start();
		
		
	}
}
