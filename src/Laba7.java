import Laba6.*;

import java.util.ArrayList;

public class Laba7 {

    private static void createPrintArray(SetOneConnect test){
        System.out.println("SetOneConnect:");
        Object[] obj = test.toArray();
        if (obj.length == 0){
            System.out.println("Empty");
        } else {
            for (Object i : obj) {
                System.out.println("i = [" + i + "]");
            }
        }
    }

    public static void main(String[] args) {

        Armor armor = new Armor(1000, 343);
        Helmet helmet = new Helmet(900,200);
        Shield shield = new Shield(900, 201);

        ArrayList array = new ArrayList();
        array.add(armor);
        array.add(armor);
        array.add(helmet);

        SetOneConnect test = new SetOneConnect(armor);
        System.out.println("SetOneConnect (armor) creation..." +
                "\nSize: " + test.size() +
                "\nIs empty? " + test.isEmpty() + "\n");
        createPrintArray(test);

        test = new SetOneConnect(array);
        System.out.println("\nSetOneConnect (armor, armor, helmet) creation..." +
                "\nSize: " + test.size() +
                "\nIs empty? " + test.isEmpty() + "\n");
        createPrintArray(test);

        test = new SetOneConnect();
        System.out.println("\nSetOneConnect (empty) creation..." +
                "\nSize: " + test.size() +
                "\nIs empty? " + test.isEmpty() + "\n");


        System.out.println("Adding armor..." +
                "\nIs successful? " + test.add(armor) + "\n");
        System.out.println("Adding armor..." +
                "\nIs successful? " + test.add(armor) + "\n");

        System.out.println("Size: " + test.size() +
                "\nIs empty? " + test.isEmpty() +
                "\nContains armor? " + test.contains(armor) +
                "\nContains new Armor (same characteristics but another object)? " +
                test.contains(new Armor(1000, 343)) +
                "\n");
        createPrintArray(test);

        System.out.println("\nRemoving armor..." +
                "\nIs successful? " + test.remove(armor));

        System.out.println("\nRemoving armor..." +
                "\nIs successful? " + test.remove(armor) + "\n");
        System.out.println("Size: " + test.size());
        System.out.println("");

        createPrintArray(test);

        System.out.println("\nAdding array (armor, armor, helmet)..." +
                "\nIs successful? " + test.addAll(array) +
                "\nSize: " + test.size() + "\n");

        createPrintArray(test);

        System.out.println("\nRemoving array (armor, armor, helmet)..." +
                "\nIs successful? " + test.removeAll(array));
        System.out.println("Size: " + test.size());
        System.out.println("");

        createPrintArray(test);

        test.add(armor);
        test.add(shield);
        test.addAll(array);
        System.out.println("\nAdding armor, shield, array (armor, armor, helmet)...");
        createPrintArray(test);
        System.out.println("\nContains armor? " + test.contains(armor));
        System.out.println("\nRemoving armor..." +
                "\nIs successful? " + test.remove(armor) + "\n");

        createPrintArray(test);

        array = new ArrayList();
        System.out.println("\nArray now is empty" +
                "\nAdding array ()..." +
                "\nIs successful? " + test.addAll(array));
        System.out.println("Size: " + test.size());

        array.add(helmet);
        System.out.println("\nArray now has helmet" +
                "\nRemoving all but array (helmet)..." +
                "\nIs successful? " + test.retainAll(array) + "\n");
        createPrintArray(test);

    }
}
