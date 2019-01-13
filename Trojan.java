
/**
 * Write a description of class Trojan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trojan implements Offense
{
    private int level = 1;
    public int getLevel(){
        return level;
    }
    public void upgrade(){
        level++;
    }
}
