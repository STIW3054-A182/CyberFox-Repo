package com.realtime.project.maven_cyberfox_255392;
package com.groupProject;

import java.util.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ValidTableLink extends ValidLink {

    private static Vector<String> existTableList = new Vector<>();
    private static String [] existTableLinkList;

    public ValidTableLink() {

    }

    public ValidTableLink(Vector<String> existList, String [] existLinkList, Vector<String> existTableList, String [] existTableLinkList) {
        super(existList, existLinkList);
        ValidTableLink.existTableList = existTableList;
        ValidTableLink.existTableLinkList = existTableLinkList;
    }

    public Vector<String> getExistTableList() {
        return existTableList;
    }

    public String [] getExistTableLinkList() {
        return existTableLinkList;
    }

    public void existTableLink() {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);

        for (int b = 0; b < getExistList().size(); b++) {
            String [] existLink = getExistLinkList();
            check link2 = new check(existLink[b]);
            Future<String> future = service.submit(link2);
            try {
                if (future.get() != null) {
                    String existTableLink = future.get();
                    existTableList.add(existTableLink);
                }
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        existTableLinkList = new String[existTableList.size()];
        existTableList.copyInto(existTableLinkList);


        service.shutdown();
    }
}
