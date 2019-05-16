package Laba6;

public class Leggings extends Ammunition{
    /**
     * Creating object of class Leggings
     * @param weight Leggings' weight
     * @param price Leggings' price
     */
    public Leggings(double weight, double price) {
        super(weight, price);
    }

    public String getType(){
        return "Leggings";
    }
}
