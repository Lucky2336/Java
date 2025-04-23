public class Counting
{
    public static void main(String[] args)
    {
        String name= "Hel@52^5";
        int NumCount=0;
        int SpecialCount=0;
        int AlphabetCount=0;
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>48 && arr[i]<57)
           {
            NumCount++;
           }
           else if(arr[i]>64 && arr[i]<91 || arr[i]>96 && arr[i]<123)
           {
            AlphabetCount++;
           }
           else
           {
            SpecialCount++;
           }
           
        }
        System.out.println("NumCount: " + NumCount);
       
        System.out.println("AlphabetCount: " + AlphabetCount);
       
        System.out.println("SpecialCount: " + SpecialCount);
       
    }
}