/**
 * Class which represents plane
 */

public class Plane{
    private String name;
    private double length;
    private double height;
    private double roz_wing;
    private double s_wing;

    /**
     * Creating object of class Plane
     * @param name Plane's name
     * @param length Plane's length
     * @param height Plane's height
     * @param roz_wing Plane's wingspan
     * @param s_wing Square of plane's wing
     */

    public Plane(String name, double length, double height, double roz_wing, double s_wing){
        this.name = name;
        this.length = length;
        this.height = height;
        this.roz_wing = roz_wing;
        this.s_wing = s_wing;
    }

    /**
     * Creating standard object of class Plane
     */

    public Plane(){
        this.name = "Н-225 'Марія'";
        this.length = 84;
        this.height = 18.1;
        this.roz_wing = 88.4;
        this.s_wing = 905;
    }

    /**
     * Output information about plane
     * @return String, information in format "[Name of parameter]": [value of parameter]
     */

    public String toString(){
        return "Назва: " + this.name + "\n" +
                "Довжина: " + this.length + "\n" +
                "Висота: " + this.height + "\n" +
                "Розмах крила: " + this.roz_wing + "\n" +
                "Площа крила: " + this.s_wing + "\n";
    }

    /**
     * @return String, name of plane
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double, height of plane
     */

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     *
     * @return double, lenght of plane
     */

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     *
     * @return double, wingspan of plane
     */

    public double getRoz_wing() {
        return roz_wing;
    }

    public void setRoz_wing(double roz_wing) {
        this.roz_wing = roz_wing;
    }

    /**
     *
     * @return double, square of plane
     */

    public double getS_wing() {
        return s_wing;
    }

    public void setS_wing(double s_wing) {
        this.s_wing = s_wing;
    }
}
