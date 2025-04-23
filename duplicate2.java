public class duplicate2
{
    public static void main(String[] args)
    {
        String name= "hhloooa";
        boolean found=false;
        char k=0;
        char[] arr=name.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            found=false;
            for(int j=i+1;j<arr.length;j++)
            {
                
                if(arr[j]==arr[i])
                {
                    k=arr[j];
                    found=true;
                    break;
                }
                
            }
            if(found==true)
            {
                System.out.println(k);
            }
        }
      
    }
}