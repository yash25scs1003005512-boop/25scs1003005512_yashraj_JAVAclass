

import java.util.Scanner;

public class Email {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter your name:");
String name = sc.nextLine();

System.out.print("Enter your email:");
String email = sc.nextLine();

System.out.println("\nName : " + name);
System.out.println("Email : " + email);

sc.close();
}
}
