import java.util.Scanner;
public class Armstrong {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num,sum=0,c=0;
        num=sc.nextInt();
        int org=num;
        for(int i=num;i!=0;i=i/10)
        {
            int digit=i%10;
            c++;
        }
        num=org;
        for(int i=num;i!=0;i=i/10)
        {
            int digit=i%10;
            sum+=(int)Math.pow(digit,c);
        }
        if(sum==num)
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong");
        sc.close();
    }
    
}
