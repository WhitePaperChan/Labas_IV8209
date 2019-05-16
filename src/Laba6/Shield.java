package Laba6;

public class Shield extends Ammunition{
    /**
     * Creating object of class Shield
     * @param weight Shield's weight
     * @param price Shield's price
     */
    public Shield(double weight, double price) {
        super(weight, price);
    }

    public String getType(){
        return "Shield";
    }
}
