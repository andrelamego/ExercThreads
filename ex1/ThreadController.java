package controller;

public class ThreadController extends Thread {
	
	private int tid = (int) threadId();

	public ThreadController() {
		super();
	}

	@Override
	public void run() {
		System.out.println("#"+tid);
	}	
}
