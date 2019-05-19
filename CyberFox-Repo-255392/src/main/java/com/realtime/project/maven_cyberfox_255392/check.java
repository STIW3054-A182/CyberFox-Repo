package com.realtime.project.maven_cyberfox_255392;

//import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class check {

    public check(java.lang.Object object) {
    }

    public static void main(String[] args) throws Exception {

    String playerlist = ""; // all player list.

    int coreCount = Runtime.getRuntime().availableProcessors();
    ExecutorService executorservice = Executors.newFixedThreadPool(coreCount);

    Path filePath = Paths.get("c:\\Users\\User\\ IdeaProjects\\cyberFox-Repo-255392\\resources\\");

    String path = String.valueOf(filePath.getParent());
    String fileName = String.valueOf(filePath.getFileName());
    
    //PropertyFileWriting propertiesFile = new PropertyFileWriting();
   // propertiesFile.WritePropertiesFile(path, fileName);
   // propertiesFile.ReadPropertiesFile();

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


    System.out.println("\n\n--------------------------- DISPLAY ALL TOP 3 PLAYERS FROM EACH CATEGORY --------------------------");
    DisplayTop3 topPlayer = new DisplayTop3();
    Thread t4 = new Thread(topPlayer);
    t4.start();
    try {
        t4.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }




    System.out.println("\n");
   static_state displayStatistics=new static_state(ValidURLlist);
   displayStatistics.RetrievePlayer();

    //System.out.println("\n\nExecution time in milliseconds: " + executeTime);
}
}
