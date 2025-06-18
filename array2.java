
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
               Scanner in = new Scanner(System.in);
               System.out.println("Enter size of Array:");
               int n=in.nextInt();
               int[] arr=new int[n];
               System.out.println("enter value of array");
               for(int i=0;i<n;i++)
               {
                arr[i]=in.nextInt();
               }
               
               for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]);
               }

               int max = 1;
               for (int j=0;j<arr.length;j++){
                if(arr[j]>max){
                    max = arr[j];
                    System.out.print(max);


                }
              }


    }
}
