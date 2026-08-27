import java.util.Scanner;
public class pasword
{
public static void main (String[] args)
{
String n;
Scanner sc = new Scanner(System.in);
System.out.println("enter a pasword=");
n=sc.next();
int a=n.length();
if (a==8)
System.out.println("acceptable");
else if(a<8)
System.out.println("weak");
else 
System.out.println("strong");
sc.close();
}
}