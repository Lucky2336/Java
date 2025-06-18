
import java.util.Scanner;

public class evod {
    public static void main(String[] args) {
        System.out.println("ENETER A NUMBER");
           Scanner in =  new Scanner(System.in);
           int a = in.nextInt();

           if(a%2==0){
            System.out.println("even");
        } 
           else {
            System.out.println("odd");
           }
            
        }
    }

