import java.util.Scanner;

public class EvenOddPositiveNegative 
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n==0)
        System.out.println("Number is zero");
        if(n<0)
        System.out.println("Number is negative");
        if(n>0)
        {
        System.out.println("number is positive");
        if(n%2==0)
        System.out.println("Number is Even");
        else
        System.out.println("Number is odd");
        }sc.close();
    }
}
