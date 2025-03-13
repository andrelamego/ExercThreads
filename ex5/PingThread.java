package controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PingThread extends Thread {
	
	private String url;
	private String name;
	
	public PingThread(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}

	public void ping() {
		
		StringBuilder cmd = new StringBuilder("ping -4 -c 10 ");
		cmd.append(url);
		String[] vetCmd = cmd.toString().split(" ");
		
		try {
			Process p = Runtime.getRuntime().exec(vetCmd);
			
			InputStream stream = p.getInputStream();
			InputStreamReader reader = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(reader);
			
			String linha = buffer.readLine();
			
			while(linha != null) {
				if(linha.contains("avg")) {
					System.out.println(name+"\nAvg: "+linha.substring(30, 36)+"ms");
				}
				
				linha = buffer.readLine();
			}
			buffer.close();
			reader.close();
			stream.close();
			
			
		} catch (Exception e) {
			String erro = e.getMessage();
			System.err.println(erro);
		}
			
	}
	
	
	@Override
	public void run() {		
		ping();
	}		
}
