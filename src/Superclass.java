public class Superclass {

    private int healthPoints;
    private int experience;

    private String name;

   public Superclass(int healthPoints, int experience, String name){
       this. healthPoints = healthPoints;
       this.experience = experience;
       this.name = name;
   }

   public void pound(){
       System.out.println(name + " used pound!");
   }

   public int getHealthPoints(){
       return healthPoints;
   }

   public void setHealthPoints(int healthPoints){
       this.healthPoints = healthPoints;
   }

   public int getExperience(){
       return experience;
   }

   public void setExperience(int experience){
       this.experience = experience;
   }

   public String getName(){
       return name;
   }

   public void setName (String name){
       this.name = name;
   }


    //waarom bij pound en scratch geen static?

}
