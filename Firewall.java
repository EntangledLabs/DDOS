
/**
 * Write a description of class Firewall here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Firewall implements Defense
{
    private int level = 1;
    public int getLevel(){
        return level;
    }
    public void upgrade(){
        level++;
    }
}
