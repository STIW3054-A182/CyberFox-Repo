package com.realtime.project.maven_cyberfox_255392;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class playerResult
{
    String line;
    private List<Dataset> list;
    Properties prop = new Properties();

    playerResult (List<Dataset> list)
    {
        this.list = list;
    }

    public void Result()
    {
        System.out.println("\nDisplay a player result ......");
        System.out.println("");
        System.out.println("RK\t   |Sno\t |Name\t\t\t\t    |Rtg\t  |State\t  |Pts\t|Category");
        System.out.println("---------------------------------------------------------------------------------------------");

        for (Dataset l: list)
        {
            for (int x = l.getRK().size()-1; x>0; x--)
            {
                if ((l.getName().get(x).equals(Name())))
                {
                    System.out.printf("| %-3s  |  %-3s  |  %-42s | %-4s | %-15s  | %-4s | %-50s |\n",l.getRK().get(x), l.getSno().get(x), l.getName().get(x), l.getRtg().get(x), l.getState().get(x), l.getPts().get(x), l.getCat().get(x));
                }
            }
        }

        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------|");    }


    public String Name()
    {
        try (InputStream input = new FileInputStream("C:\\Users\\USER\\Downloads\\Pictures\\Compressed\\CyberFox-Repo-255392\\player.properties"))
        {
            prop.load(input);
            line = prop.getProperty("player");
        }

        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        return line;
    }
}
