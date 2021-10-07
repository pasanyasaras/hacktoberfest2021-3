public class Sorting {
    
    void test2()
    {
        int[] arr = {50,10,20,30,89,74,63,21,11};
        int temp=0;
        int i,j=0;
        
        for(i=0; i<arr.length; i++)
        {
            //System.out.println(arr[i]);
            for(j=0; j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        
            System.out.println(arr[0]);
        
        
    }
    
}
