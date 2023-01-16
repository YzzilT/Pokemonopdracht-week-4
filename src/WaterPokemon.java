public class WaterPokemon extends Superclass {

    private int waterAmount;
    private int oxygenLevel;

    public WaterPokemon(int healthPoints, int experience, String name, int waterAmount, int oxygenLevel){
        super(healthPoints, experience, name);
        this. waterAmount = waterAmount;
        this. oxygenLevel = oxygenLevel;
    }

    @Override
    public void pound(){
        System.out.println(getName() + " used pound!");
    }

    public void superSoaker(){
        System.out.println(getName() + " used supersoaker!");
    }

    public int getWaterAmount(){
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount){
        this.waterAmount = waterAmount;
    }

    public int getOxygenLevel(){
        return oxygenLevel;
    }

    public void setOxygenLevel(){
        this.oxygenLevel = oxygenLevel;
    }


}
