import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Laba4 {
    public static void main(String[] args) {
        Plane [] planes = new Plane[3];
        planes[0] = new Plane();
        planes[1] = new Plane("Nya", 9999, 1, 1, 1);
        planes[2] = new Plane("Untitled", 9999, 99, 99, 99);

        //var 1
        System.out.println("Variant 1\n");

        Arrays.sort(planes, Comparator.comparing(Plane::getName));
        System.out.println("Comparing by Name:");

        for (Plane i: planes){
            System.out.println(i.getName());
        }
        System.out.print("\n");

        Arrays.sort(planes, Comparator.comparing(Plane::getHeight).reversed());
        System.out.println("Comparing by height (reversed)");

        for (Plane i: planes){
            System.out.println("Height: " + i.getHeight() + "(name: " + i.getName() + ")");
        }
        System.out.print("\n");

        //var 2
        System.out.println("Variant 2\n");

        //Arrays.sort(planes, Comparator.comparing(Plane::getLength).reversed().thenComparing(Plane::getName).reversed());
        Arrays.sort(planes, Comparator.comparing(Plane::getLength).thenComparing(Collections.reverseOrder(Comparator.comparing(Plane::getName))));
        System.out.println("Comparing by length and name (reversed)");

        for (Plane i: planes){
            System.out.println("Length: " + i.getLength() + "(name: " + i.getName() + ")");
        }
        System.out.print("\n");

    }
}
