import java.util.*;
public class countnodivisible
{
    public  static void main(String[] args )
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter N=");
        int n=sc.nextInt();
     System.out.println("Number divisible by 3 between 1 to N");
    int c=0;
    for(int i=1;i<=n;i++)
    {
        if(i%3==0)
        {
        c++;
        }
    }
    System.out.println(c+" ");
    
sc.close();

    }
}
