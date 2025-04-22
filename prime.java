public class prime {
    public static void main(String[] args) {

        int ar[] = { 2, 3, 38, 7, 11, 13, 15, 16, 18, 20 };
        boolean found=true;
        for (int i = 0; i < ar.length; i++) 
        {
            for (int j = 2; j <= (ar[i]) / 2; j++)
             {
                found = true;
                if (ar[i] % j == 0)
                 {
                    found = false;
                    break;
                }
            }
            if (found == true) {
                System.out.print(ar[i] + "\t");
            }

        }
    }
}
