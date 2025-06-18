import java.util.Scanner;

public class loop3{
    public static void main(String[] args) {
         System.out.println("ENTER FIRST NUMBER");
           Scanner in =  new Scanner(System.in);
        
           int a = in.nextInt();

           for ( int i=0;i<=a;i++){
            System.out.println(i);
           }
           
    }
}