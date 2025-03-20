package Model;

import java.time.LocalDateTime;

public class TrashbinStatus
{
    private int trashbinStatusID;
    private int trashbinID;
    private int statusID;
    private LocalDateTime dateTime;
    private int percentageFull;
    private boolean readyForEmptying;
    private boolean isDangerous;

    public TrashbinStatus(int trashbinID, LocalDateTime dateTime, int percentageFull, boolean isDangerous, boolean readyForEmptying)
    {
        this.trashbinID = trashbinID;
        this.dateTime = dateTime;
        this.percentageFull = percentageFull;
        this.readyForEmptying = readyForEmptying;
        this.isDangerous = isDangerous;
    }

    public TrashbinStatus()
    {
    }

    public int getTrashbinStatusID()
    {
        return trashbinStatusID;
    }

    public void setTrashbinStatusID(int trashbinStatusID)
    {
        this.trashbinStatusID = trashbinStatusID;
    }

    public int getTrashbinID()
    {
        return trashbinID;
    }

    public void setTrashbinID(int trashbinID)
    {
        this.trashbinID = trashbinID;
    }

    public int getStatusID()
    {
        return statusID;
    }

    public void setStatusID(int statusID)
    {
        this.statusID = statusID;
    }

    public LocalDateTime getDateTime()
    {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime)
    {
        this.dateTime = dateTime;
    }

    public int getPercentageFull()
    {
        return percentageFull;
    }

    public void setPercentageFull(int percentageFull)
    {
        this.percentageFull = percentageFull;
    }

    public boolean isReadyForEmptying()
    {
        return readyForEmptying;
    }

    public void setReadyForEmptying(boolean readyForEmptying)
    {
        this.readyForEmptying = readyForEmptying;
    }

    public boolean isDangerous()
    {
        return isDangerous;
    }

    public void setDangerous(boolean isDangerous)
    {
        this.isDangerous = isDangerous;
    }
}
