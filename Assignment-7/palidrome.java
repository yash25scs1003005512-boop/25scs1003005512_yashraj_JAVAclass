import java.util.Scanner;
public class palidrome {
   public static void main(String []args)
   {
    Scanner sc=new Scanner(System.in);
    int n,rev=0;
    System.out.println("Enter the number:");
    n=sc.nextInt();
    for(int i=n;i!=0;i=i/10)
    {
        int digit=i%10;
        rev=rev*10+digit;
    }
    if(rev==n)
        System.out.println("Palindrome");
    else
        System.out.println("Not Palindrome");
    sc.close();
   } 
}
