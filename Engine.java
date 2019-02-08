public class Engine
{
    private numberCalculator num;
    public Engine(){
        num = new numberCalculator();
    }
    public void upgrade(Player p, Object o){
       int bal = p.getCPU();
       int level = o.getLevel();
       int cost = getCost(level);
       if (cost <= bal && num.canUpgrade(o)){
           
       }
    }
}
