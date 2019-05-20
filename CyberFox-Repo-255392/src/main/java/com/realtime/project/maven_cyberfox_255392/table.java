package com.realtime.project.maven_cyberfox_255392;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.List;
import java.io.IOException;
public class table {
    List <String> List;
    Document doc;
    String text = "";
    String y= "";

    public table(List <String> ValidList){

        this.List =ValidList;

    }

    public void Checktable () throws IOException {

        for (int x = 0; x < List.size(); x++) {
            doc = Jsoup.connect(List.get(x)).get();
            Elements table = doc.select("table.CRs1 tr");
            for (Element tr : table) {
                Elements tds = tr.getElementsByTag("td");
                if (tds.hasText()){
                    Elements table2 = table.select("div.defaultDialog h6");
                    for (Element tr1 : table2) {
                        Elements tds1 = tr1.getElementsMatchingText("\\d{20}?");
                        if (!y.equals(tds1.text())&&(tds1.hasText())){
                            text += tds1.text() + "\n";
                            y = tds1.text();
                          
                        }

                    }
                    text+=tds.text()+"\n";
                }
            }
        }
    }

    public String getPlayerList() {
        return text;
    }

}
