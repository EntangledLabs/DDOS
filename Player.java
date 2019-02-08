
/**
 * Abstract class Player - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Player
{
    private Antimalware antimalware = new Antimalware();
    private Firewall firewall = new Firewall();
    private ZeroDay zeroday = new ZeroDay();
    private DDOS ddos = new DDOS();
    private Trojan trojan = new Trojan();
    private Worm worm = new Worm();
    private int CPU = 0;
    public int getCPU(){
        return CPU;
    }
    public void addCPU(){
        CPU += 10;
    }
    //Precondition: amount is >= the value of CPU
    public void spendCPU(int amount){
        CPU -= amount;
    }
    //Subtracts CPU
    //Precondition: moneh is correctly calculated
    public void boughtSomething(int moneh){
        CPU-=moneh;
    }
    //Object "get" statements
    public Firewall getFirewall(){
        return firewall;
    }
    public Antimalware getAntimalware(){
        return antimalware;
    }
    public ZeroDay getZeroDay(){
        return zeroday;
    }
    public DDOS getDDOS(){
        return ddos;
    }
    public Trojan getTrojan(){
        return trojan;
    }
    public Worm getWorm(){
        return worm;
    }
}
