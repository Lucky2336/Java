public class mergearray {
    public static void main(String[] args) {
        int[] arr1={1,2};
        int[] arr2={3,4};
        int[] arr3= new int[arr1.length + arr2.length];

        
        for(int i=0;i<arr1.length;i++)
        {
             arr3[i]=arr1[i];
        }

        for(int i=0;i<arr1.length;i++)
        {
             arr3[arr1.length+i]=arr2[i];
        }
         

        for ( int i=0;i<arr1.length+arr2.length;i++)
        System.out.println(arr3[i]);

    }
}
