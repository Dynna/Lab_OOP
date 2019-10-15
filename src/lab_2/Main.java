package lab_2;
import java.lang.String;
import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        Box firstBox = new Box();
        System.out.println("First box calls constructor without parameters and has same values like \nHeight: " + firstBox.height +
                "\nWidth: " + firstBox.width + "\nDepth: " + firstBox.depth);
        Box secondBox = new Box(2.5f);
        System.out.println("Second box calls constructor with one parameter and has the same value for all properties " +
                "that I set equal to \nHeight: " + secondBox.height + "\nWidth: " + secondBox.width + "\nDepth: " +
                secondBox.depth);
        Box thirdBox = new Box(1.5f, 2.4f, 3.3f);
        System.out.println("Third box calls constructor with 3 parameters and has values that I set like \nHeight: " +
                thirdBox.height + "\nWidth: " + thirdBox.width + "\nDepth: " + thirdBox.depth);

        Queue fruits = new Queue(3);
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("orange");
        System.out.println("Fruits: " + Arrays.toString(fruits.queue));
        System.out.println("Pop elements from fruits queue: ");
        while (!fruits.isEmpty()) {
            System.out.printf(" %s", fruits.pop());
        }

        Queue colors = new Queue();
        colors.push("red");
        colors.push("yellow");
        if (!colors.isFull()) {
            colors.push("pink");
        }
        System.out.println("\nColors: " + Arrays.toString(colors.queue));

        System.out.println("The surface area of the third Box is: " + thirdBox.computeSurfaceArea());
        System.out.println("The volume of the third Box is: " + thirdBox.computeVolume());
    }
}
