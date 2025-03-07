package view;

import controller.ThreadController;

public class Main {
	public static void main(String[] args) {
		//ThreadController t = new ThreadController();
		
		for (int i = 0; i < 5; i++) {
			ThreadController t = new ThreadController();
			t.start();
		}
	}
}
