
import java.util.*;

public class Add {
    public static void main(String[] args){

        Scanner no = new Scanner (System.in);

        System.out.println("Enter value of a : ");
        int a = no.nextInt();
        System.out.println("Enter value of b : ");
        int b = no.nextInt();

        int sum = a + b ;

        System.out.println("Sum = ");
        System.out.println(sum);
    }
}
