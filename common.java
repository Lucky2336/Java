public class common {
    public static void main(String[] args) {
        int[] arr1={1,2,5,9,12};
        int[] arr2={1,2,4,25,12};
        for( int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]+" ");
                    break;
                }
            }
        }
    }
}
