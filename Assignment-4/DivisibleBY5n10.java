import java.util.Scanner;
public class DivisibleBY5n10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a Number:");
        n=sc.nextInt();
        if(n%5==0)
        {
            System.out.println("Number is Divisible by 5");
            if(n%10==0)
                System.out.println("And Also divisible by 10");
            else
                System.out.println("And Not Divisible by 10");
        }
        else
            System.out.println("Not divisible by 5");
        sc.close();
    }
    
}
