import java.util.Scanner;
public class LargestNumber {
    public  static void main(String[] args )
    {
int a,b,c;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 3 number:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    if(a>b && a>c)
    
        System.out.println("largest is "+a);
    
    else if(b>a && b>c)
        System.out.println("largest is "+b);
    else
        System.out.println("largest is "+c);
sc.close();
}

}
