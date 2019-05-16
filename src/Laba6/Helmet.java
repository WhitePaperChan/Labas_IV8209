package Laba6;

public class Helmet extends Ammunition{
    /**
     * Creating object of class Helmet
     * @param weight Helmet's weight
     * @param price Helmet's price
     */
    public Helmet(double weight, double price) {
        super(weight, price);
    }

    public String getType(){
        return "Helmet";
    }
}
