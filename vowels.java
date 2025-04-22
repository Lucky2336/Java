public class vowels
{
    public static void main(String[] args)
    {
        String name= "samasyawithaeo";
        int count=0;
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}