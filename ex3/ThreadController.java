package controller;

public class ThreadController extends Thread {
	
	private int tid = (int) threadId();
	private int[] vetor;
	private int i;

	public ThreadController(int i, int[] vetor) {
		super();
		this.i = i;
		this.vetor = vetor;
	}

	private void preencher() {
		if(i % 2 == 0) {
			
			double tempoInicial = System.nanoTime();
			
			for (int x = 0; x < vetor.length; x++) {
				//vetor[x] = (int) ((Math.random() * 100) + 1);
			}

			double tempoFinal = System.nanoTime();
			double tempo = tempoFinal - tempoInicial;
			double tempoExec = tempo / Math.pow(10, 6);
			
			System.out.println("#"+tid+": "+tempoExec+"s ==> fori");
		}
		else {
			double tempoInicial = System.nanoTime();
			
			for (int x : vetor) {
				//vetor[x] = (int) ((Math.random() * 100) + 1);
			}
			
			double tempoFinal = System.nanoTime();
			double tempo = tempoFinal - tempoInicial;
			double tempoExec = tempo / Math.pow(10, 6);
			
			System.out.println("#"+tid+": "+tempoExec+"s ==> foreach");
			
		}
	}
	
	@Override
	public void run() {		
		preencher();
	}		
}
