package Laba6;

public class Armor extends Ammunition{
    /**
     * Creating object of class Armor
     * @param weight Armor's weight
     * @param price Armor's price
     */
    public Armor(double weight, double price) {
        super(weight, price);
    }

    public String getType(){
        return "Armor";
    }
}
