import java.util.Scanner;

public class d511 {
    public static void main(String[] args) {
        System.out.println("ENTER FIRST NUMBER");
           Scanner in =  new Scanner(System.in);
           int a = in.nextInt();

           if(a%5==0){
            System.out.println("divisible by 5");
           }

            else if(a%11==0){
                System.out.println("divisible by 11");
            }

            else {
                System.out.println("not divisible by 5 and 11");
            }
           
    }

}
