package controller;

public class ThreadController extends Thread {
	
	private int tid = (int) threadId();
	private int[] linha;

	public ThreadController(int[] linha) {
		super();
		this.linha = linha;
	}

	@Override
	public void run() {
		int soma = 0;
				
		for (int i = 0; i < linha.length; i++) {
			soma = soma + linha[i];			
		}
		System.out.print("#"+tid+": "+linha[0]+" + "+linha[1]+" + "+linha[1]+" + "+linha[2]+" + "+linha[3]+" + "+linha[4]+" = "+soma+"\n");
	}	
}
