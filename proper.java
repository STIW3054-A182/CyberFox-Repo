package com.realtime.project.cyberfox_project;

import java.io.*;
import java.util.Properties;

public class proper {

    private Properties prop = new Properties();

    void WritePropertiesFile(String path, String fileName) {
        try (OutputStream output = new FileOutputStream("config.properties")) {
            // set the properties value
            System.out.println("Writing to the properties file ......");
            prop.setProperty("path", path);
            prop.setProperty("textFile", fileName);
            prop.setProperty("sTATE", "KEDAH");
            prop.setProperty("sTATE2", "PERAK");
            prop.setProperty("sTATE3", "KUALA LUMPUR");
            prop.setProperty("sTATE4", "N.SEMBILAN");
            prop.setProperty("sTATE5", "PULAU PINANG");
            prop.setProperty("sTATE6", "PAHANG");
            prop.setProperty("sTATE7", "SELANGOR");
            prop.setProperty("sTATE8", "PUTRAJAYA");
            prop.setProperty("sTATE9", "JOHOR");
            prop.setProperty("sTATE10", "MELAKA");
            prop.setProperty("sTATE11", "SARAWAK");
            prop.setProperty("sTATE12", "SABAH");
            prop.setProperty("sTATE13", "KELANTAN");
            //prop.setProperty("top 3", "3");
            prop.store(output, null);
            System.out.println("Successfully saved to properties file.");
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    void ReadPropertiesFile() {
        try (InputStream input = new FileInputStream("config.properties")) {
            // load a properties file
            prop.load(input);
            System.out.println("\nReading from the properties file .....");
            // get the property value and print it out
            System.out.println("Path      -> " + prop.getProperty("path"));
            System.out.println("File Name -> " + prop.getProperty("textFile"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
