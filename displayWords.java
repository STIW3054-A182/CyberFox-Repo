package com.realtime.project.cyberfox_project;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 
public class displayWords {
 
  public static void main(String[] args) {
    try {
      // fetch the document over HTTP
      Document doc = Jsoup.connect("http://chess-results.com/tnr424278.aspx?lan=1&art=1&rd=8").get();
      
      // get the page title
      String title = doc.title();
      System.out.println("title: " + title);
      
      // get all links in page
      Elements links = doc.select("KEDAH");
      for (Element link : links) {
        // get the value from the href attribute
        System.out.println("\nlink: " + link.attr("href"));
        System.out.println("text: " + link.text());
      }
    } catch (IOException e) {
    e.printStackTrace();
    }
  }
}