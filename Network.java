package com.realtime.project.cyberfox_project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

public class Network implements Callable<String> {
    private String url, path;

    Network(String path, String url) {
        this.path = path;
        this.url = url;
    }

    private boolean checkURL(String url) {

        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(60000);
            connection.setReadTimeout(60000);
            connection.setRequestMethod("HEAD");
            return (connection.getResponseCode() == HttpURLConnection.HTTP_OK);
        } catch (Exception e) {
            return false;

        }
    }

    @Override
    public String call() throws Exception {
        if (checkURL(url)) {
            //ystem.out.println(Thread.currentThread().getName() + "-" + url + ": Exist");

        } else{
            try {
                Log logFile = new Log();
                logFile.createLogFile(path, url);
                url = "0";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return url;
    }
}
