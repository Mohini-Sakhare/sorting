
//code of selection sort and its complexity is O(n2)

public class selectionsort
{
    public static void printarray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void selections(int arr[])
    {
       for(int i=0; i<arr.length-1; i++) //outer loop
       {
         int currpos=i;
         for(int j=i+1; j<arr.length; j++) //inner loop
         {
            if(arr[currpos]>arr[j]) // > used for increasing order
                                    // < used for decreasing order
            {
                currpos = j;
            }
         }
         //swap
         int temp=arr[currpos];
         arr[currpos]=arr[i];
         arr[i]=temp;
       }
    }
    
    public static void main(String args[])
    {
        int arr[]={5,4,1,3,2};
        selections(arr);
        printarray(arr);
    }
}