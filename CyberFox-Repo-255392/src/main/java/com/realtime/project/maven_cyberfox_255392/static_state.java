package com.realtime.project.maven_cyberfox_255392;

import org.apache.commons.lang3.StringUtils;
//import org.apache.commons.collections4.CollectionUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
//import java.text.DecimalFormat;
//import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class static_state {
private List<String> ValidURLList;
private Properties prop = new Properties();

static_state(List<String> ValidURLList) {
    this.ValidURLList = ValidURLList;
}

void RetrievePlayer() throws IOException, ParseException {

    System.out.println("\nAll players  ......");
    System.out.println("");
    System.out.println("Name\t\t\t\t   |State\t  |Category");
    System.out.println("-----------------------------------------------------------------");
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
       
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showCat = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("KEDAH")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayer(name, showCat);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------");    
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showPERAK = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("PERAK")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerPERAK(name, showPERAK);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
   
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showKL = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("KUALA LUMPUR")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerKL(name, showKL);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showN9 = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("N.SEMBILAN")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerN9(name, showN9);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showPENANG = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("PULAU PINANG")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerPENANG(name, showPENANG);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showPAHANG = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("PAHANG")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerPAHANG(name, showPAHANG);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showSELANGOR = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("SELANGOR")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerSELANGOR(name, showSELANGOR);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showPJAYA = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("PUTRAJAYA")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerPJAYA(name, showPJAYA);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showJOHOR = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("JOHOR")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerJOHOR(name, showJOHOR);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showMELAKA = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("MELAKA")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerMELAKA(name, showMELAKA);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showSARAW = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("SARAWAK")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerSARAW(name, showSARAW);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showSABAH = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("SABAH")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerSABAH(name, showSABAH);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    
    
    for (String s : ValidURLList) {
        Document doc = Jsoup.connect(s).get();
        // System.out.println(doc.outerHtml());
        Elements b = doc.select("div:nth-child(2)");
        for (Element header : b) {
            Elements h2 = header.select("h2");
            String category = h2.text();
            if (StringUtils.contains(category, "NATIONAL")) {
                String showKELAN = StringUtils.substringAfter(category, "9");
                Elements a = doc.select("table.CRs1 tr");
                for (Element row : a) {
                    String state = row.select("td:nth-child(7)").text();

                    String name = row.select(" td:nth-child(4)").text();

                    if (state.contains("KELANTAN")) {
                  	 // System.out.println("\n-----------------------------------------------------------------");
                        ShowPlayerKELAN(name, showKELAN);
                       // System.out.println("\n-----------------------------------------------------------------");
                    }
                    
                }
            }       
        }
    }
    System.out.println("\n-----------------------------------------------------------------"); 
    System.out.println("\n Total all the players = 322"); 
    System.out.println("\n-----------------------------------------------------------------"); 
}



private void ShowPlayer( String name, String showCat) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE"), showCat);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {   
        ex.printStackTrace();
   
    }
}

 

private void ShowPlayerPERAK( String name, String showPERAK) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE2"), showPERAK);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}



private void ShowPlayerKL( String name, String showKL) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE3"), showKL);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


private void ShowPlayerN9( String name, String showN9) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE4"), showN9);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


private void ShowPlayerPENANG( String name, String showPENANG) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE5"), showPENANG);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


private void ShowPlayerPAHANG( String name, String showPAHANG) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE6"), showPAHANG);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


private void ShowPlayerSELANGOR( String name, String showSELANGOR) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE7"), showSELANGOR);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


private void ShowPlayerPJAYA( String name, String showPJAYA) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE8"), showPJAYA);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

private void ShowPlayerJOHOR( String name, String showJOHOR) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE9"), showJOHOR);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

private void ShowPlayerMELAKA( String name, String showMELAKA) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE10"), showMELAKA);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

private void ShowPlayerSARAW( String name, String showSARAW) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE11"), showSARAW);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


private void ShowPlayerSABAH( String name, String showSABAH) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE12"), showSABAH);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

private void ShowPlayerKELAN( String name, String showKELAN) {
    try (InputStream input = new FileInputStream("config.properties")) {    // load a properties file
        prop.load(input);
        System.out.printf("\n %-30s | %-8s | %-8s", name,prop.getProperty("sTATE13"), showKELAN);
        //System.out.println("\n");
        //System.out.println("\n-----------------------------------------------------------------");

    } catch (IOException ex) {
        ex.printStackTrace();
    }
}

}
