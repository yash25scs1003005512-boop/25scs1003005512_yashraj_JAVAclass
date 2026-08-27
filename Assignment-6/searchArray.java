import java.util.Scanner;
public class searchArray {
    public static void main(String[] args)
    {
        int n,s,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array");
        n=sc.nextInt();
        System.out.println("Enter elements of the array:");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();}
        System.out.println("Enter search elements:");
        s=sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==s)
                c++;}
        if(c==1)
            System.out.println("element present");
            else
                System.out.println("not present");
        sc.close();
    }
}
