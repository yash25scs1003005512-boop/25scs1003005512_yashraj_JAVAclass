import java.util.Scanner;
public class occurenceOFelement
{
    public  static void main(String[] args )
    {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of  the array=");
        n=sc.nextInt();
        System.out.println("Enter "+n+" elements of the array");
        int arr[]=new int[n];
    for(int i=0;i<n;i++)
         arr[i]=sc.nextInt(); 
    System.out.print("Enter element to count =");   
    int e=sc.nextInt();
    int c=0;
    for(int i=0;i<n;i++){
         if(arr[i]==e)
            c++;}
    System.out.println("Occurence of "+e+" = "+c);
sc.close();
 }
}


    

