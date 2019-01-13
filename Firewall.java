
/**
 * Write a description of class Firewall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Firewall implements Defense
{
    private int level = 0;
    private boolean closePorts = false;
    private int closeBackdoors = 0;
    public int getLevel(){
        return level;
    }
    public void upgrade(){
        level++;
    }
    public boolean portsClosed(){
        return closePorts;
    }
    public int backdoorProtectLevel(){
        return closeBackdoors;
    }
    public void closePorts(){
        closePorts = true;
    }
    public void closeBackdoors(){
        closeBackdoors++;
    }
}
