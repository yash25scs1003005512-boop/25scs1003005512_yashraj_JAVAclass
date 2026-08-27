import java.util.Scanner;
public class SumofArray
{
    public  static void main(String[] args )
    {
        int n,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of  the array=");
        n=sc.nextInt();
        System.out.println("Enter elements of the array");
        int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
         arr[i]=sc.nextInt();
         sum+=arr[i];
    }
    System.out.println("sum of array="+sum);
    
sc.close();

    }
}
