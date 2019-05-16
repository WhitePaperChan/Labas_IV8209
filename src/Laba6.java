import Laba6.*;
public class Laba6 {
    public static void main(String[] args) {

        Helmet helmet = new Helmet(3, 1500);
        Armor armor = new Armor(5,2500);
        Leggings leggings = new Leggings(3,1500);
        Shield shield = new Shield(4,2000);

        Knight knight = new Knight(helmet, armor, leggings, shield);
        System.out.println("Not sorted: " + knight);
        knight.sortByWeight();
        System.out.println("\nSorted by weight: " + knight);

        System.out.println("\n" + knight.checkPriceInRange(1500, 2000));

    }
}
