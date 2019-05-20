package com.realtime.project.maven_cyberfox_255392;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class logg extends Thread 
{

    private Date logDate = new Date();

    void createLogFile(String path, String url) throws IOException {

        File logFilePath = new File(path);
        logFilePath.mkdir();

        String LogFileName = "RemoveLink"+".log";
        File logFile = new File(logFilePath, LogFileName);
        logFile.createNewFile();

        FileWriter writefile = new FileWriter(logFile.toString(),true);
        writefile.write(String.valueOf(logDate) + "\n");
        writefile.append(url).append(" : Not Exists\n");
        writefile.close();
    }
}
