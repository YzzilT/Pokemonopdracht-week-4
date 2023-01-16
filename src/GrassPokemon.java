public class GrassPokemon extends Superclass {

    private int leavesAmount;
    private int seedAmount;

    public GrassPokemon (int healthPoints, int experience, String name, int leavesAmount, int seedAmount){
        super(healthPoints, experience, name);
        this. leavesAmount = leavesAmount;
        this. seedAmount = seedAmount;
    }

    @Override
    public void pound(){
        System.out.println(getName() + " does not know pound, use different attack");
    }

    public void leafStorm(){
        System.out.println(getName() + " used leafstorm!");
    }

    public int getLeavesAmount(){
        return leavesAmount;
    }

    public void setLeavesAmount(int leavesAmount){
        this.leavesAmount = leavesAmount;
    }

    public int getSeedAmount(){
        return seedAmount;
    }

    public void setSeedAmount(int seedAmount){
        this.seedAmount = seedAmount;
    }



    /*public static void razorLeaf(){
        System.out.println("pokemont used razorleaf!");
    }

    public static void bulletSeed(){
        System.out.println("pokemon used bulletseed!");
    }

    public String getRazorLeaf(){
        return razorLeaf;
    }
    public void setRazorLeaf(String razorLeaf){
        this.razorLeaf = razorLeaf;
    }

    public String getBulletSeed(){
        return bulletSeed;
    }

    public void setBulletSeed(String bulletSeed){
        this.bulletSeed = bulletSeed;
    }*/



}
