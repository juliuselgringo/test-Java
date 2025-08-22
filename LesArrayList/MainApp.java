public class MainApp{

    public static void main(String[] args){

        // Les tableaux
        System.out.println("//Les tableaux \n");

        // Tableau pré-rempli
        System.out.println("// Tableau prérempli\n");

        System.out.println(Warrior.warriorsArray1.toString());
        Warrior.warriorsArray1[1] = "replace";
        for(int i = 0; i < Warrior.warriorsArray1.length; i++){
            
            System.out.println(Warrior.warriorsArray1[i]);
        }
        
        // Tableau de taille prédéfinie
        System.out.println("\n// Tableau de taille prédéfinie\n");
        Warrior.warriorsArray2[1] = new Warrior("newWarrior","shadow");
        System.out.println("\nclassique for");
        for(int i = 0; i < Warrior.warriorsArray2.length; i++){
            
            System.out.println(Warrior.warriorsArray2[i]);
        }
        System.out.println("\nfor each");
        for(Warrior elt : Warrior.warriorsArray2){
            System.out.println(elt);
        }

        // Les Listes
        System.out.println("\n// Les Listes\n");
        Warrior.warriorsList.remove(0);
        Warrior warriorOfList1 = new Warrior("warriorOfList1", "listman");
        Warrior warriorOfList2 = new Warrior("warriorOfList2", "listman");
        System.out.println(Warrior.warriorsList.get(1));
        System.out.println(Warrior.warriorsList.toString());



        // Les MAPS
        System.out.println("\n//Les MAPS\n");
        Warrior warrior1 = new Warrior("jul","elfic");
        Warrior warrior2 = new Warrior("juan","orc");
        Warrior.warriorsMap.remove("newWarrior");
        Warrior neWarrior = new Warrior("newOne", "horadrim");
        System.out.println(warrior1);
        System.out.println(Warrior.warriorsMap.get("juan"));
        System.out.println("\ntoString\n" + Warrior.warriorsMap.toString());
        System.out.println("\nGETTER\n" + Warrior.getWarriorsWMap());
        
        
        // test tri sur liste
        System.out.println("\n// test tri sur liste String\n");

        Warrior.letterList.add("z");
        Warrior.letterList.add("a");
        Warrior.letterList.add("b");
        Warrior.letterList.add(0,"d");
        Warrior.letterList.add(1,"f");

        System.out.println(Warrior.letterList);

        Warrior.letterList.sort(null);

        System.err.println(Warrior.letterList);

        System.out.println("\n// test tri sur liste int\n");

        Warrior.intList.add(55);
        Warrior.intList.add(0);
        Warrior.intList.add(-1);
        Warrior.intList.add(0,12);
        Warrior.intList.add(1,33);

        System.out.println(Warrior.intList);

        Warrior.intList.sort(null);

        System.err.println(Warrior.intList);

        System.err.println(Warrior.intList.getLast());
        String letters = Warrior.intList.toString();
        System.err.println(letters.split(", ")[0]);
        System.err.println(letters.split(", ")[1]);
    }
}