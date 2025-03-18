package Model;

import java.util.Date;

public class Trashbin
{
    private int id;
    private java.util.Date date;
    private String location;
    private int percentageFull;
    private boolean readyForEmptying;
    private int daysSinceLastEmptied;
    private boolean isGreenLight;
    private boolean isGreenBlink;
    private boolean isYellowBlink;
    private boolean isRedLight;
    private boolean dangerous;
    private boolean immediately;

    public boolean isImmediately()
    {
        return immediately;
    }

    public void setImmediately(boolean immediately)
    {
        this.immediately = immediately;
    }

    public boolean isDangerous()
    {
        return dangerous;
    }

    public void setDangerous(boolean dangerous)
    {
        this.dangerous = dangerous;
    }

    public boolean isRedLight()
    {
        return isRedLight;
    }

    public void setRedLight(boolean redLight)
    {
        isRedLight = redLight;
    }

    public boolean isYellowBlink()
    {
        return isYellowBlink;
    }

    public void setYellowBlink(boolean yellowBlink)
    {
        isYellowBlink = yellowBlink;
    }

    public boolean isGreenBlink()
    {
        return isGreenBlink;
    }

    public void setGreenBlink(boolean greenBlink)
    {
        isGreenBlink = greenBlink;
    }

    public boolean isGreenLight()
    {
        return isGreenLight;
    }

    public void setGreenLight(boolean greenLight)
    {
        isGreenLight = greenLight;
    }

    public int getDaysSinceLastEmptied()
    {
        return daysSinceLastEmptied;
    }

    public void setDaysSinceLastEmptied(int daysSinceLastEmptied)
    {
        this.daysSinceLastEmptied = daysSinceLastEmptied;
    }

    public boolean isReadyForEmptying()
    {
        return readyForEmptying;
    }

    public void setReadyForEmptying(boolean readyForEmptying)
    {
        this.readyForEmptying = readyForEmptying;
    }

    public int getPercentageFull()
    {
        return percentageFull;
    }

    public void setPercentageFull(int percentageFull)
    {
        this.percentageFull = percentageFull;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

}
