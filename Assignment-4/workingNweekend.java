import java.util.Scanner;

public class workingNweekend
{
public static void main(String[] args)
{
int n;
Scanner sc= new Scanner(System.in);
System.out.println("enter Day number 1-7:");
n=sc.nextInt();
if (n>=1&&n<=5)
System.out.println("working day");
else if(n==6||n==7)
System.out.println("weekend");
else
System.out.println("invalid");
sc.close();
}
}