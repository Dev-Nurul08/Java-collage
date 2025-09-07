import java.util.*;
public class Great {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);
        int a =  no.nextInt();
        int b = no.nextInt();

        if(a == b){
            System.out.println("Both numbers are equal");
        }else{
            if(a>b){
                System.out.println("A is greater");
            }else{
                System.out.println("B is greater");
            }
        }


    }
}
