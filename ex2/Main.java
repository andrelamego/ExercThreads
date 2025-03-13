package view

public class Main {
	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		int[] linha = new int[5];
		int[] linha2 = new int[5];
		int[] linha3 = new int[5];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (int) ((Math.random() * 10) + 1);
				linha[j] = matriz[0][j];
				linha2[j] = matriz[1][j];
				linha3[j] = matriz[2][j];
			}
		}
		
		ThreadController t = new ThreadController(linha);
		ThreadController t2 = new ThreadController(linha2);
		ThreadController t3 = new ThreadController(linha3);
		t.start();
		t2.start();
		t3.start();
		
		
	}
}
