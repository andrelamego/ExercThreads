package view;

import controller.PingController;

public class Main {
	public static void main(String[] args) {

		PingController controller = new PingController();
		
		controller.ping();
	}
}
