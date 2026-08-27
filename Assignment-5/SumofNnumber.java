import java.util.Scanner;
public class SumofNnumber {
    public  static void main(String[] args )
    {
int n;
int sum=0;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter n number:");
    n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        sum+=i;
    }
    System.out.println("sum of n numbers="+sum);
sc.close();
    }
}
