package com.realtime.project.cyberfox_project;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class display_players {
	public static void main(String[] args) throws Exception 
	{ 
	   Document doc1 = Jsoup.connect("http://chess-results.com/tnr424274.aspx?lan=1&art=1&rd=8").get();
	   Document doc2 = Jsoup.connect("http://chess-results.com/tnr424275.aspx?lan=1&art=1&rd=7").get();
	   Document doc3 = Jsoup.connect("http://chess-results.com/tnr424278.aspx?lan=1&art=1&rd=8").get();
	   Document doc4 = Jsoup.connect("http://chess-results.com/tnr424279.aspx?lan=1&art=1&rd=8").get();
	   Document doc5 = Jsoup.connect("http://chess-results.com/tnr424280.aspx?lan=1&art=1&rd=8").get();
	   Document doc6 = Jsoup.connect("http://chess-results.com/tnr424281.aspx?lan=1&art=1&rd=8").get();
	   Document doc7 = Jsoup.connect("http://chess-results.com/tnr424282.aspx?lan=1&art=1&rd=8").get();
	   Document doc8 = Jsoup.connect("http://chess-results.com/tnr424285.aspx?lan=1&art=1&rd=8").get();
	   Document doc9 = Jsoup.connect("http://chess-results.com/tnr424286.aspx?lan=1&art=1&rd=8").get();
	   Document doc10 = Jsoup.connect("http://chess-results.com/tnr424287.aspx?lan=1&art=1").get();
	   // get the page title
	   String title1 = doc1.title();
	   String title2 = doc2.title();
	   String title3 = doc3.title();
	   String title4 = doc4.title();
	   String title5 = doc5.title();
	   String title6 = doc6.title();
	   String title7 = doc7.title();
	   String title8 = doc8.title();
	   String title9 = doc9.title();
	   String title10 = doc10.title();
	   System.out.println("|                                     Category                                               | Total |");
	   System.out.println("|--------------------------------------------------------------------------------------------|-------|");
	   System.out.println("|"+title1  + "       |   24  |" );
	   System.out.println("|"+title2  + "      |   65  |" );
	   System.out.println("|"+title3  + "      |   68  |" );
	   System.out.println("|"+title4  + "      |   38  |" );
	   System.out.println("|"+title5  + "            |   19  |" );
	   System.out.println("|"+title6  + "      |   14  |" );
	   System.out.println("|"+title7  + "     |   38  |" );
	   System.out.println("|"+title8  + "     |   28  |" );
	   System.out.println("|"+title9  + "     |   18  |" );
	   System.out.println("|"+title10 + "  |   10  |" );
	   System.out.println("|--------------------------------------------------------------------------------------------|-------|");
	   System.out.println("Total = 322 players");
}
}
