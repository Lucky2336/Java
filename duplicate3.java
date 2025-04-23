public class duplicate3
{
    public static void main(String[] args)
    {
        String name= "committeee";
        char k=0;
        int count=1;
        int max=0;
        char var='0';
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[j]==arr[i])
                {
                    k=arr[j];
                    count++;
                }
                if(count>max)
                {
                    var=k;
                    max=count;
                }
            }
        }
            System.out.println(var + ":" + max);
        
      
    }
}