package controller;

public class PingController {
	
	
	private String os() {
		String name = System.getProperty("os.name");
		return name;
	}
	
	public void ping() {
		String osName = os();
		
		if(os().contains("Win")) {
			System.err.println("SO incompatível");
		}
		else {
			PingThread ping1 = new PingThread("www.google.com.br", "GOOGLE:");
			PingThread ping2 = new PingThread("www.uol.com.br", "UOL:");
			PingThread ping3 = new PingThread("www.terra.com.br", "TERRA:");
			
			ping1.start();
			ping2.start();
			ping3.start();
		}
		
	}
}
