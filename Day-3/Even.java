
import java.util.*;

public class Even {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if(num%2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }
}
