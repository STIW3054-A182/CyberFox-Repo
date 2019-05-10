package com.realtime.project.cyberfox_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	
	public static void main (String args[]) throws IOException {
		
	
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(coreCount);
		
		File file = new File("C:\\Users\\USER\\git\\CyberFox-Repo\\cyberfox-project\\URL.txt");
		BufferedReader read = new BufferedReader(new FileReader(file));
		
		String scan;
		while ((scan=read.readLine())!=null) {
			Thread myThread = new Thread(new VerifyURL(scan));
			service.execute(myThread);
		}
		read.close();
		service.shutdown();
		
		while(!service.isTerminated()){}
		
			
	}
}