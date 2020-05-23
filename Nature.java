public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        hawkeye.takesOff();
        hawkeye.ascends(120);
        hawkeye.ascends(10000);
        hawkeye.ascends(1200);
        hawkeye.glides();
        hawkeye.descends(9500);
        hawkeye.landsOnRock(1000);
        hawkeye.takesOff();
        int i=0, step=200;
        while(hawkeye.isFlying())
        {
            i++;
            if (i>10){
                i=0;
                if (step>10){
                    step-=5;
                }
                if (step<5){
                    step=5;
                }                
            }
            
            hawkeye.descends(step);
            hawkeye.lands();
        }
            
    }
}
