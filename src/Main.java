import java.awt.*;

public class Main {
    public static void main(String[] args) {
// Point and String are classes that create or declare reference data types
// as opposed to primitive data types.
        // Difference between them are Point will mirror 2 variables
        // but String does not.
        Point point1 = new Point(1,1);
        Point point2 = point1;
        System.out.println(point1);
        System.out.println(point2);

        point1.x = 2;
        System.out.println(point1);
        System.out.println(point2);

        point2.x = 5;
        System.out.println(point1);
        System.out.println(point2);

        point2.y = 8;
        System.out.println(point1);
        System.out.println(point2);


        String message1 = new String("Hello World 1 !");
        System.out.println(message1);
        // or use this shorter way
//        String message1 = "Hello World 1 !";

        String message2 = message1;
        System.out.println(message2);

        //no change in this:
        message2.replace("!","*");
        System.out.println(message2);

        // change in this but only limited in this single statement
        System.out.println(message2.replace("!","*"));
        System.out.println(message2);

        message2 = " I only changed message 2"; // message1 does not change, unlike Point
        System.out.println(message2);
        System.out.println(message1);


    }
}
