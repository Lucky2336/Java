import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter MxN :-");
        int N = in.nextInt();
        int M = in.nextInt();

        int [][] mat = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = in.nextInt();
            }
        }
     
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
               System.out.println(mat[i][j]+" ");
            }
            System.out.println();
        }

        int sum = 0;
        int max = mat[0][0];
        int min = mat[0][0];
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                int val = mat[i][j];
                sum+=val;
                if(val<max)
                max=val;
                if(val<min)
                min = val;
                if(val%2==0)
                evencount++;
                else
                oddcount++;
                
            }
        }
        System.out.println("Sum of elements: " + sum);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Even count: " + evencount);
        System.out.println("Odd count: " + oddcount);


in.close();

    }
}
