
/**
 * Abstract class Player - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Player
{
    private Defense antimalware = new Antimalware();
    private Defense firewall = new Firewall();
    private Offense zeroday = new ZeroDay();
    private Offense ddos = new DDOS();
    private Offense trojan = new Trojan();
    private Offense worm = new Worm();
    private double CPU = 1.0;
    public double getCPU(){
        return CPU;
    }
    public void addCPU(){
        CPU += 1.0;
    }
    public void upgradeDefense(String input){
        if (input == "antimalware"){
            antimalware.upgrade();
        } else if (input == "firewall"){
            firewall.upgrade();
        } else if (input == "zeroday"){
            zeroday.upgrade();
        } else if (input == "ddos"){
            ddos.upgrade();
        } else if (input == "trojan"){
            trojan.upgrade();
        } else if (input == "worm"){
            worm.upgrade();
        }
    }
}
