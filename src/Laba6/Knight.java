package Laba6;

import java.util.Arrays;
import java.util.Comparator;

public class Knight {
    private Ammunition [] ammunition;

    /**
     * Creationg object of type Knight
     * @param helmet Helmet
     * @param armor Armor
     * @param leggings Leggings
     * @param shield Shield
     */
    public Knight(Helmet helmet, Armor armor, Leggings leggings, Shield shield){
        this.ammunition = new Ammunition[4];
        this.ammunition[0] = helmet;
        this.ammunition[1] = armor;
        this.ammunition[2] = leggings;
        this.ammunition[3] = shield;
    }

    /**
     * Sorts ammunition of the knight by weight (increasing)
     */
    public void sortByWeight(){
        Arrays.sort(ammunition, Comparator.comparing(Ammunition::getWeight));
    }

    /**
     * Getting information about ammunition of the knight
     * @return String, Ammunition: (ammunition in order)
     */
    public String toString(){
        String ammunitionString = "Ammunition: ";
        for(Ammunition i: ammunition){
            ammunitionString += "\n" + i;
        }
        return ammunitionString;
    }

    /**
     * Checking ammunition in range
     * @param first first number (including)
     * @param last last number (including
     * @return String, Ammunition with price from (first) to (last): (ammunition)
     */
    public String checkPriceInRange(double first, double last){
        String results = "Ammunition with price from " + first + " to " + last + ": ";
        for(Ammunition i: ammunition){
            double price = i.getPrice();
            if (price >= first && price <= last){
                results += "\n" + i.getType() + " (" + price + " uah)";
            }
        }
        return results;
    }
}
