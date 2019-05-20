package com.realtime.project.maven_cyberfox_255392;

import java.util.ArrayList;
import java.util.List;

public class Dataset
{
    private List <String>cRK = new ArrayList<>();
    private List <String>cSno = new ArrayList<>();
    private List <String>cName = new ArrayList<>();
    private List <String>cRtg = new ArrayList<>();
    private List <String>cState = new ArrayList<>();
    private List <String>cPts = new ArrayList<>();
    private List <String>cCat = new ArrayList<>();

    public List<String> getRK()
    {
        return cRK;
    }

    public List<String> getSno()
    {
        return cSno;
    }

    public List<String> getName()
    {
        return cName;
    }

    public List<String> getRtg()
    {
        return cRtg;
    }

    public List<String> getState()
    {
        return cState;
    }

    public List<String> getPts()
    {
        return cPts;
    }

    public List<String> getCat()
    {
        return cCat;
    }

    public void setRK(String RK)
    {
        cRK.add(RK);
    }

    public void setSno(String Sno)
    {
        cSno.add(Sno);
    }

    public void setName(String Name)
    {
        cName.add(Name);
    }

    public void setRtg(String Rtg)
    {
        cRtg.add(Rtg);
    }

    public void setState(String State)
    {
        cState.add(State);
    }

    public void setPts(String Pts)
    {
        cPts.add(Pts);
    }

    public void setCat(String Cat)
    {
        cCat.add(Cat);
    }
}