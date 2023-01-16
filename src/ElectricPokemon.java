public class ElectricPokemon extends Superclass {

    private int ampere;
    private int voltLevel;

    public ElectricPokemon (int healthPoints, int experience, String name, int ampere, int voltLevel){
        super(healthPoints, experience, name);
        this.ampere = ampere;
        this.voltLevel = voltLevel;
    }


    @Override
    public void pound(){
        System.out.println(getName() + " used pound");
    }

    public void thunder(){
        System.out.println(getName() + " used Thunder");
    }



    public int getAmpere(){
        return ampere;
    }

    public void setAmpere(int ampere){
        this.ampere = ampere;
    }

    public int getVoltLevel(){
        return voltLevel;
    }

    public void setVoltLevel(int voltLevel){
        this.voltLevel = voltLevel;
    }


}
