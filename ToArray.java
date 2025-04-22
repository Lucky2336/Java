public class ToArray
{
    public static void main(String[] args)
    {
        String name= "TestSubject";
        int count=0;
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            count=0;
            for(int j=0;j<arr.length;j++)
            {
                
                if(arr[j]==arr[i])
                {
                    count++;
                }
            }
            System.out.println(arr[i]+":"+count);
        }
    }
}