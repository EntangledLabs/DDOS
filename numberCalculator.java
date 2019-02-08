import java.lang.Math;
/**
 * Write a description of class PenetrationCalculator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class numberCalculator
{
    private int[][] penetrationPercent = {
            {5,10,15,20,25},
            {10,20,30,40,50},
            {20,25,30,35,40},
            {35,46,57,68,79},
            {70,80,90,100},
            {100}
        };
    private int[][] cpuCosts = {
            {0,10,20,25,30},
            {15,25,35,45,55},
            {10,15,20,25,30},
            {25,30,35,40,45},
            {50,60,70,80},
            {100},
        };
    public boolean attackSuccessful(Firewall firewall, Antimalware antimalware, Offense offense){
        int defense = penetrationPercent[0][firewall.getLevel()-1];
        if (antimalware.isInstalled()){
            defense += penetrationPercent[1][antimalware.getLevel()-1];
        }
        int malware = 0;
        if (offense instanceof Worm){
            malware = 2;
        } else if (offense instanceof Trojan) {
            malware = 3;
        } else if (offense instanceof DDOS){
            malware = 4;
        } else if (offense instanceof ZeroDay){
            malware = 5;
        }
        int attack = penetrationPercent[malware][offense.getLevel()-1];
        int chance = attack-defense;
        System.out.println(chance);
        int generator = (int)(Math.random()*100)+1;
        System.out.println(generator);
        return generator<=chance;
    }

    public void upgrade(Object upgradeable){
        Offense o; Defense d;
        if (upgradeable instanceof Defense){
            d = (Defense)upgradeable;
            d.upgrade();
        } else if (upgradeable instanceof Offense){
            o = (Offense)upgradeable;
            o.upgrade();
        }
    }

    public int getCost(Object input, int level){
        int ans = 0;
        if (input instanceof Firewall){
            ans = cpuCosts[0][level-1];
        } else if (input instanceof Antimalware){
            ans = cpuCosts[1][level-1];
        } else if (input instanceof Worm){
            ans = cpuCosts[2][level-1];
        } else if (input instanceof Trojan){
            ans = cpuCosts[3][level-1];
        } else if (input instanceof DDOS){
            ans = cpuCosts[4][level-1];
        } else if (input instanceof ZeroDay){
            return 100;
        } else {
            return -1;
        }
        return ans;
    }

    public boolean canUpgrade(Object upgradeable){
        Defense defense; Offense offense;
        if (upgradeable instanceof Defense){
            defense = (Defense)upgradeable;
            if (defense.getLevel() == 5){
                return false;
            }
        } else if (upgradeable instanceof Offense){
            offense = (Offense)upgradeable;
            if (offense instanceof ZeroDay){
                return false;
            } else if (offense instanceof DDOS){
                if (offense.getLevel() == 4){
                    return false;
                }
            }
            if (offense.getLevel() == 5){
                return false;
            }
        } else {
            return false;
        }
        return true;
    }
}
