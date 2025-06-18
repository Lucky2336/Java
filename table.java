import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("ENTER FIRST NUMBER");
           Scanner in =  new Scanner(System.in);
           int a = in.nextInt();
            //int sum = 0;

            for(int i=1;i<=11;i++){
                
                System.out.println(a+"*"+i+"="+(a*i));
            }
    }
}
