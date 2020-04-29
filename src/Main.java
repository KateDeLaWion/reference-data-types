import java.awt.*;

public class Main {
    public static void main(String[] args) {

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


        // a long way can be done but there is a short way
//        String message1 = new String("Hello World 1 !");
//        System.out.println(message1);
        // this shorter way:
        String message1 = "Hello World 1 !";

        String message2 = message1;
        System.out.println(message2);


        message2.replace("!","*");
        System.out.println(message2);


        System.out.println(message2.replace("!","*"));
        System.out.println(message2);

        message2 = " I only changed message 2";
        System.out.println(message2);
        System.out.println(message1);


    }
}
