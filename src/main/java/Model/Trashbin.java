package Model;

import java.time.LocalDateTime;

public class Trashbin
{
    private int id;
    private LocalDateTime dateTime;
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

    public Trashbin(int id, LocalDateTime dateTime, String location, int percentageFull, boolean readyForEmptying, int daysSinceLastEmptied, boolean isGreenLight, boolean isGreenBlink, boolean isYellowBlink, boolean isRedLight, boolean dangerous, boolean immediately)
    {
        this.id = id;
        this.dateTime = dateTime;
        this.location = location;
        this.percentageFull = percentageFull;
        this.readyForEmptying = readyForEmptying;
        this.daysSinceLastEmptied = daysSinceLastEmptied;
        this.isGreenLight = isGreenLight;
        this.isGreenBlink = isGreenBlink;
        this.isYellowBlink = isYellowBlink;
        this.isRedLight = isRedLight;
        this.dangerous = dangerous;
        this.immediately = immediately;
    }

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

    public LocalDateTime getDateTime()
    {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime)
    {
        this.dateTime = dateTime;
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
