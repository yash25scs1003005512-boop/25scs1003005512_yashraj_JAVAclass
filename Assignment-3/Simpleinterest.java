import java.util.Scanner;

public class Simpleinterest {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Input
System.out.print("Enter Principal Amount:");
double principal = sc.nextDouble();

System.out.print("Enter Rate of Interest: ");
double rate = sc.nextDouble();

System.out.print("Enter Time (Years):");
double time = sc.nextDouble();

// Calculate Simple Interest
double simpleInterest = (principal * rate * time) / 100;

// Output
System.out.println("Simple Interest =" + simpleInterest);

sc.close();
}
}