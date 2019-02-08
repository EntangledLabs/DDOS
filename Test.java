public class Test{
    public static void test(){
        Firewall firewall = new Firewall();
        Antimalware antimalware = new Antimalware();
        ZeroDay zeroday = new ZeroDay();
        DDOS ddos = new DDOS();
        Trojan trojan = new Trojan();
        Worm worm = new Worm();
        numberCalculator numbers = new numberCalculator();
        antimalware.install();
        for (int i = 0; i < 10; i++){
            numbers.upgrade(firewall);
        }
        for (int i = 0; i < 10; i++){
            numbers.upgrade(antimalware);
        }
        for (int i = 0; i < 10; i++){
            numbers.upgrade(ddos);
        }
        System.out.println(numbers.attackSuccessful(firewall, antimalware, zeroday));
    }

    public static void generatorTester(){
        for (int i = 0; i < 10; i++){
            System.out.println((int)(Math.random()*100)+1);
        }
    }
    
    public static void testUpgrade(){
        Firewall firewall = new Firewall();
        Antimalware antimalware = new Antimalware();
        ZeroDay zeroday = new ZeroDay();
        DDOS ddos = new DDOS();
        Trojan trojan = new Trojan();
        Worm worm = new Worm();
        numberCalculator numbers = new numberCalculator();
        System.out.println(numbers.upgrade(zeroday));
    }
}