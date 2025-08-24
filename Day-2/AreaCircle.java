import java.util.*;

public class AreaCircle{
    public static void main(String[] args){
        final float pi = 3.14f;
        
        Scanner radius = new Scanner(System.in);



        System.out.println("Enter Radius of circle : ");
        int r = radius.nextInt();

        double area_circle = r * pi * pi;

        System.out.println("Area of circle = " + area_circle);


    }
}