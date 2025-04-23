public class vowels
{
    public static void main(String[] args)
    {
        String name= "Hel@523^5";
        int count=0;
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
            {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
        System.out.println("Consonant: " + (arr.length-count));

    }
}