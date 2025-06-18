public class copyarray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2= new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr2[i];
           }

           for(int j=0;j<arr1.length;j++){
            System.out.println(arr2[j]);
           }

           
    }
}
