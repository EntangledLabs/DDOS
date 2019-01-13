
/**
 * Write a description of class DDOS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DDOS implements Offense
{
    private int level = 1;
    public int getLevel(){
        return level;
    }
    public void upgrade(){
        level++;
    }
}
