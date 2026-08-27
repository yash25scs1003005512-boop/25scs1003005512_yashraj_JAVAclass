import java.util.Scanner;
public class largestinarray
{
    public  static void main(String[] args )
    {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of  the array=");
        n=sc.nextInt();
        System.out.println("Enter elements of the array");
        int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
         arr[i]=sc.nextInt();
    }
        int max=arr[0];
         for(int i=0;i<n;i++)
         {
         if(arr[i]>max)
            max=arr[i];
         }
    System.out.println("largest element ="+max);   
sc.close();
 }
}


    

