/*row wise sum */

public class sumarray3 {
    public static void main(String[] args) {
        int[][] arr={ {1,2,3,4},{1,2,3,4}};
        int rsum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                rsum=rsum+arr[i][j];

                System.out.println(rsum);

            }
        }
    }
}
