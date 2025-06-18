
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
           System.out.println("ENTER FIRST NUMBER");
           Scanner in =  new Scanner(System.in);
           int a = in.nextInt();

         
           System.out.println("ENTER operator");
           char c = in.next().charAt(0);


           System.out.println("ENTER SECOND NUMBER");
           int b = in.nextInt();

           switch(c){
            case '+':
            System.out.println(a+b);
            break;
            case '-':
            System.out.println(a-b);
            break;
            case '*':
            System.out.println(a*b);
            break;
            case '/':
            System.out.println(a/b);

           }




    }
}
