public class Firepokemon extends Superclass {

    private double temperature;
    private String flameHeight;


    public Firepokemon(int healthPoints, int experience, String name, double temperature, String flameHeight) {
        super(healthPoints,experience, name);
        this.temperature = temperature;
        this. flameHeight = flameHeight;
    }

    @Override
    public void pound(){
        System.out.println(getName() + " does not know pound but used flamethrower instead");
    }

    public void flameThrower(){
        System.out.println( getName() + " used flamethrower!");
    }

    public String getFlameHeight() {
        return flameHeight;
    }

    public void setFlameHeight (String flameHeight){
        this.flameHeight = flameHeight;
    }

    public double getTemperature(){
        return temperature;
    }

    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
}
