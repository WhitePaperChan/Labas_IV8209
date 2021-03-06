package Laba6;

public class Ammunition {
    private double weight;
    private double price;

    /**
     * Creating object of class Ammunition
     * @param weight Ammunition's weight
     * @param price Ammunition's price
     */
    public Ammunition(double weight, double price) throws IncorrectAmmunitionWeightException{
        if (weight <= 0){
            throw new IncorrectAmmunitionWeightException();
        } else {
            this.weight = weight;
        }
        if (price <= 0) {
            throw new IncorrectAmmunitionPriceException();
        } else {
            this.price = price;
        }
    }

    /**
     * Getting weight of ammunition (kg)
     * @return double, weight of ammunition (kg)
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Setting weight of ammunition (kg)
     * @param weight double, weight of ammunition (kg)
     */
    public void setWeight(double weight) {
        if (weight <= 0){
            throw new IncorrectAmmunitionWeightException();
        } else {
            this.weight = weight;
        }
    }

    /**
     * Getting price of ammunition (uah)
     * @return double, price of ammunition (uah)
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setting price of ammunition (uah)
     * @param price double, price of ammunition (uah)
     */
    public void setPrice(double price) {
        if (price <= 0) {
            throw new IncorrectAmmunitionPriceException();
        } else {
            this.price = price;
        }
    }

    /**
     * Getting type of ammunition
     * @return String, type of ammunition
     */
    public String getType(){
        return "Ammunition";
    }

    public String toString(){
        return this.getType() + " (" + this.getWeight() + " kg, " + this.getPrice() + " uah)";
    }
}
