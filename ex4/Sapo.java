package controller;

public class Sapo extends Thread {
	
	private int pulo;
	private int distancia;
	private int numSapo;
	
	public Sapo(int pulo, int distancia, int numSapo) {
		super();
		this.pulo = pulo;
		this.distancia = distancia;
		this.numSapo = numSapo;
	}
	
	public void iniciarCorrida() {
		
		int distPercorrida = 0;
		
		while(distPercorrida < distancia) {
			pulo = (int) (Math.random() * 11);
			distPercorrida = distPercorrida + pulo;
			
			System.out.println("Sapo "+numSapo+"==> Distancia Percorrida: "+distPercorrida+"m/100m - Ultimo Salto: "+pulo+"m");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("\nSapo "+numSapo+" terminou a corrida!\n");
	}
	

	@Override
	public void run() {		
		iniciarCorrida();
	}		
}
