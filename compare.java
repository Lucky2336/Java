public class compare {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};

        boolean isEqual = java.util.Arrays.equals(arr1,arr2);

        if(isEqual){
            System.out.println("EQUAL");
        }
        else{
            System.out.println("NOT EQUAL");
        }
        }
}
