package com.realtime.project.maven_cyberfox_255392;

import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class DisplayTop3 extends ValidTableLink implements Runnable {

    public DisplayTop3() {

    }

    public DisplayTop3(Vector<String> existList, String [] existLinkList, Vector<String> existTableList, String [] existTableLinkList) {
        super(existList, existLinkList, existTableList, existTableLinkList);
    }

    @Override
    public void run() {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        for (int z = 0; z < getExistTableList().size(); z++) {
            String [] tableLink4 = getExistTableLinkList();
            topPlayer tp = new topPlayer(tableLink4[z]);
            FutureTask<String> future;
            future = (FutureTask<String>) service.submit(tp);
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        service.shutdown();
    }
}
