package com.realtime.project.cyberfox_project;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class check {

public static void main(String[] args) throws Exception {

    String playerlist = ""; // all player list.

//    long startTime = System.currentTimeMillis();
//    long endTime = System.currentTimeMillis();
//    long executeTime = endTime - startTime;

    int coreCount = Runtime.getRuntime().availableProcessors();
    ExecutorService executorservice = Executors.newFixedThreadPool(coreCount);

    Path filePath = Paths.get("C:\\Users\\BCC\\Downloads\\CyberFox-Repo-master\\CyberFox-Repo-master\\cyberfox-project\\URL.txt"); // tukar link 
    String path = String.valueOf(filePath.getParent());
    String fileName = String.valueOf(filePath.getFileName());

    proper propertiesFile = new proper();
    propertiesFile.WritePropertiesFile(path, fileName);
    propertiesFile.ReadPropertiesFile();

    List<String> myURLArrayList = Files.readAllLines(filePath);
    List<String> ValidURLlist = new ArrayList<>();
    System.out.println("\nVerifying the URLs ......");

    for (String url : myURLArrayList) {
        Future<String> ValidURL = executorservice.submit(new network(path, url));
        if (!ValidURL.get().equals("0"))
            ValidURLlist.add(ValidURL.get());
    }
    ValidURLlist.forEach(System.out::println);
    executorservice.shutdown();

    while (!executorservice.isTerminated()) {
    }

    try {
        if (!executorservice.awaitTermination(60, TimeUnit.SECONDS)) { //wait for existing tasks to terminate
            executorservice.shutdownNow(); //cancel currently executing task
            if (!executorservice.awaitTermination(60, TimeUnit.SECONDS)) { //wait for tasks to respond to being cancelled
                System.err.println("Service didn't terminate!");
            }
        }
    } catch (InterruptedException e) {
        executorservice.shutdownNow(); //re-cancel if current thread also interrupted
        Thread.currentThread().interrupt(); //preserve interrupt status
    }

    table CheckT = new table(ValidURLlist);
    CheckT.Checktable();
    System.out.println("\n");
    playerlist = CheckT.getPlayerList();
    System.out.println("|                                  Count the number of players                                      |");
    System.out.println("|---------------------------------------------------------------------------------------------------|");
  
    System.out.println("\n" +playerlist);
    System.out.println("|---------------------------------------------------------------------------------------------------|");
    System.out.println("Total player = 322 ");

  

   System.out.println("\n");
   static_state displayStatistics=new static_state(ValidURLlist);
   displayStatistics.RetrievePlayer();
   
   displayKedah displayPlayerFromKedah = new displayKedah(ValidURLlist);
   displayPlayerFromKedah.RetrievePlayer();
   

    //System.out.println("\n\nExecution time in milliseconds: " + executeTime);
}
}