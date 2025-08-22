import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Warrior {
    private String pseudo;
    private String origin;
    public static String[] warriorsArray1 = {"d","a","c","b"}; //tableau fixe, de taille déterminée
    public static Warrior[] warriorsArray2 = new Warrior[10]; //tableau fixe, de taille déterminée

    public static ArrayList<Warrior> warriorsList = new ArrayList<Warrior>();
    public static ArrayList<String> letterList = new ArrayList<>();
    public static ArrayList<Integer> intList = new ArrayList<>();


    public static Map<String,Warrior> warriorsMap = new HashMap<>();
    

    /**
     * 
     * @param pseudo String
     * @param origin String
    */
    public Warrior(String pseudo, String origin){
        this.pseudo = pseudo;
        this.origin = origin;
        warriorsMap.put(pseudo, this);
        warriorsList.add(this);
    }

    /**
     * 
     * @return Map<String,Warrior>
     */
    public static Map<String,Warrior> getWarriorsWMap(){
        return warriorsMap;
    }

    /**
     * TO STRING WARRIOR
     */
    @Override
    public String toString(){
        return this.pseudo + " est un guerrier " + this.origin;
    }

}
