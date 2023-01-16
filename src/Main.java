public class Main {
    public static void main(String[] args) {

        Firepokemon charizard = new Firepokemon(100, 30, "Charizard", 40.5, "2 meters");
        GrassPokemon bulbasaur = new GrassPokemon(19, 5, "Bulbasaur", 80, 40);
        ElectricPokemon electobuzz = new ElectricPokemon(80, 37, "Electrobuzz", 6, 230);
        WaterPokemon goldeen = new WaterPokemon(60, 20, "Goldeen", 100, 100);

        charizard.pound();
        charizard.flameThrower();
        bulbasaur.pound();
        bulbasaur.leafStorm();
        electobuzz.pound();
        electobuzz.thunder();
        goldeen.pound();
        goldeen.superSoaker();




    }
}