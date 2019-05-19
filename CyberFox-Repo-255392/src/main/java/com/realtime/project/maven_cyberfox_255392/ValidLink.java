package com.realtime.project.maven_cyberfox_255392

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ValidLink {

    private static Vector<String> existList = new Vector<>();
    private static String [] existLinkList;
    private int coreCount;
    private ExecutorService service;
    private Future<String> future;

    public ValidLink() {

    }

    public ValidLink(Vector<String> existList, String [] existLinkList) {
        ValidLink.existList = existList;
        ValidLink.existLinkList = existLinkList;
    }

    public Vector<String> getExistList() {
        return existList;
    }

    public String[] getExistLinkList() {
        return existLinkList;
    }

    public void allLink() throws IOException {
        coreCount = Runtime.getRuntime().availableProcessors();
        service = Executors.newFixedThreadPool(coreCount);

        Path path1 = Paths.get("src\\main\\resources\\URL.txt");
        List<String> line;
        line = Files.readAllLines(path1);

        for (int a=0; a<line.size();a++) {

            check checkUrls = new check(line.get(a));
            future = service.submit(checkUrls);
            try {
                if (future.get() != null) {
                    String existLink = future.get();
                    existList.add(existLink);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        existLinkList = new String[existList.size()];
        existList.copyInto(existLinkList);

        service.shutdown();
    }
}
