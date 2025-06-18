import java.util.Scanner;

public class pos2 {
    public static void main(String[] args) {
        System.out.println("ENETER A NUMBER");
           Scanner in =  new Scanner(System.in);
           int num = in.nextInt();

           if(num>0){
            System.out.println("positive");
        }
        else if (num<0){
            System.out.println("negative");
        }

        else{
            System.out.println("zero");
        }
    }
}
