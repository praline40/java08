public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;
    private int altitudeMax=1300;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sings() {
        return "Screech!%n";
    }

    @Override
    public void takesOff()
    {
        if (!this.flying) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }
    
    @Override
    public void lands()
    {
        if (this.flying && this.altitude <= 5) {
            this.flying = false;
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high in the air (%d), it can't land.%n", this.getName(),this.altitude);
        }
    }

    @Override
    public void landsOnRock(int altitudeRock)
    {
        if(this.altitude > altitudeRock){
            this.altitude = altitudeRock;
            this.flying = false;
            System.out.printf("%s has landed on this rock, altitude: %d.%n", this.getName(), altitudeRock);
        }  
        else
        {
            System.out.printf("%s can't land on this rock, it is too high!%n", this.getName());
        }  
    }

    @Override
    public void glides(){
         System.out.printf("%s glides into the air.%n",this.getName());
    }

    @Override
    public int ascends(int meters)
    {
         if (this.flying) {
            if (this.altitude == altitudeMax){
                System.out.printf("%s is already at its altitude max: %d.%n", this.getName(), this.altitudeMax);
            }
            else if (this.altitude+meters >= altitudeMax){
                this.altitude = altitudeMax;
                System.out.printf("%s ascends, altitude max reached: %d.%n", this.getName(), this.altitudeMax);
            }
            else
            {
                this.altitude += meters;
                System.out.printf("%s ascends, altitude reached: %d.%n", this.getName(), this.altitude);
            }
        }
        return this.altitude;
         
    }

    @Override
    public int descends(int meters)
    {
        if (this.flying) {
            if (this.altitude-meters > 0){
                this.altitude -=meters;
                System.out.printf("%s descends, altitude reached: %d.%n", this.getName(), this.altitude);
            }
            else
            {
                lands();
            }
        }
        return this.altitude;
    }

   
}
