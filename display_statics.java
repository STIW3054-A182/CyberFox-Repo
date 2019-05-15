package com.realtime.project.cyberfox_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class display_statics 
{ 
public static void main(String[] args) throws Exception 
{ 	
 	int countCore= Runtime.getRuntime().availableProcessors();
 	ExecutorService service = Executors.newFixedThreadPool(countCore);
 	
    //File file = new File("C:\\Users\\User\\Desktop\\url.txt"); 
    File file = new File("C:\\Users\\User\\Downloads\\CyberFox-Repo-master\\CyberFox-Repo-master\\cyberfox-project\\URL.txt"); 
    BufferedReader scan = new BufferedReader(new FileReader(file )); 

    String read;
    
    int i=1;
    while ((read= scan.readLine()) != null) {
        Thread mythread = new Thread(new VerifyURL(read), "Thread"+i);
        service.execute(mythread);
        i++; 
    }
   scan.close();
   service.shutdown();
   
   while (!service.isTerminated()) {}
   
   System.out.println("\n");
   System.out.println("The total players for each category: \n");

   File f = new File("C:\\Users\\User\\Downloads\\CyberFox-Repo-master\\CyberFox-Repo-master\\cyberfox-project\\display_static.txt"); 
   Scanner sc = new Scanner(f); 

   while (sc.hasNextLine()) 
	   System.out.println(sc.nextLine()); 
   System.out.println("\n");

 
} 
}
