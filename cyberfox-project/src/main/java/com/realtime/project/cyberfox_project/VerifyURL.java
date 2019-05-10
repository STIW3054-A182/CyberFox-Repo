package com.realtime.project.cyberfox_project;

import java.net.HttpURLConnection;
import java.net.URL;
import org.jsoup.Jsoup;


public class VerifyURL implements Runnable {
	
	String url;
	public VerifyURL(String url) {
		this.url=url;
		
	}
	
	public void run() {
		 if (test1(url)) {
			 if (test2(url)) 
				 System.out.println(Thread.currentThread().getName()+"--" + url + " ---> valid");
			 else {
				 System.out.println(Thread.currentThread().getName()+"--" + url + " ---> Invalid");
			 } 
			 }
			 else {
				 
				 System.out.println(Thread.currentThread().getName()+"--" + url + " ---> Doesn't Exist");
			 }
		 }
		 
		 

		public static boolean test1(String address) {

			try {
				HttpURLConnection.setFollowRedirects(false);
				HttpURLConnection con = (HttpURLConnection) new URL(address).openConnection();
				con.setConnectTimeout(1000);
				con.setReadTimeout(1000);
				con.setRequestMethod("HEAD");
				return (con.getResponseCode() == HttpURLConnection.HTTP_OK);
			} catch (Exception e) {
				return false;
			}
		}
		private boolean test2(String url1) {
				try {
					
					org.jsoup.nodes.Document i = Jsoup.connect(url1).get();
					if(i.select("table.CRs1").isEmpty()) {
						return false;
						
					}
				}
				
				catch(Exception e) {
					
				}
				
				return true;
			}
			
		}



