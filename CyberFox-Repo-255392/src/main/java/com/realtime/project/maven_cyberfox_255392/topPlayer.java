package com.realtime.project.maven_cyberfox_255392;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.Properties;
import java.util.concurrent.Callable;

public class topPlayer implements Callable {

    private String link;

    public topPlayer(String link) {
        this.link = link;
    }

    @Override
    public String call() {
        PropertyFileWriting obj = new PropertyFileWriting();
        Properties write = obj.setProperties();
        String prop1 = write.getProperty("Top1");
        String prop2 = write.getProperty("Top2");
        String prop3 = write.getProperty("Top3");

        Document doc;
        try {
            doc = Jsoup.connect(link).get();

            String title = doc.title();
            int scrape = title.indexOf("9");
            String category = title.substring(scrape + 1).replace("(", "").replace(")", "");

            Element sub = doc.select("div.defaultDialog").get(1); //subtitle
            Elements subt = sub.select("h2");
            String subtitle = subt.text();
            System.out.println(subtitle);

            String format4 = "| %-5s | %-5s | %-35s | %-8s | %-13s | %-8s | %-8s |\n";
            System.out.format(format4, "RK", "SNo", "Name", "Rtg", "State", "Pts", "Category");
            String format5 = "| %-5s | %-5s | %-35s | %-8s | %-13s | %-8s | %-8s |\n";
            System.out.format(format5, "-----", "-----", "-----------------------------------",
                    "--------", "-------------", "--------", "--------");

            for (Element row : doc.select("table.CRs1 tr")) {
                final String rk = row.select("td:nth-of-type(1)").text();
                final String sno = row.select("td:nth-of-type(2)").text();
                final String name = row.select("td:nth-of-type(4)").text();
                final String rtg = row.select("td:nth-of-type(6)").text();
                final String state = row.select("td:nth-of-type(7)").text();
                final String pointer = row.select("td:nth-of-type(8)").text();

                if (rk.equals(prop1)) {
                    String format = "| %-5s | %-5s | %-35s | %-8s | %-13s | %-8s | %-8s |\n";
                    System.out.format(format, rk, sno, name, rtg, state, pointer, category);
                }
                else if (rk.equals(prop2)) {
                    String format2 = "| %-5s | %-5s | %-35s | %-8s | %-13s | %-8s | %-8s |\n";
                    System.out.format(format2, rk, sno, name, rtg, state, pointer, category);
                }
                else if (rk.equals(prop3)) {
                    String format3 = "| %-5s | %-5s | %-35s | %-8s | %-13s | %-8s | %-8s |\n";
                    System.out.format(format3, rk, sno, name, rtg, state, pointer, category);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return link;
    }
}
