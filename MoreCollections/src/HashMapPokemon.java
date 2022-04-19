import java.util.HashMap;
public class HashMapPokemon {
    public static void main(String[] args) {
        HashMap<Integer, Pokemon> dex = new HashMap<>();

        Pokemon bulbasaur = new Pokemon(1, "Bulbasaur", "Grass");
        Pokemon squirtle = new Pokemon(7, "Squirtle", "Water");

        dex.put(bulbasaur.getNumber(), bulbasaur);
        dex.put(squirtle.getNumber(), squirtle);

        for(Integer key : dex.keySet())
        {
            System.out.println("Key:\t" + key + "\nValue:\t" + dex.get(key) +"\n");
        }
    }
}
