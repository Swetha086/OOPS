import java.util.Scanner;

public class Swap {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int a= sc.nextInt();
    System.out.println("Enter a number:");
    int b= sc.nextInt();
    b=a+b;
    a=b-a;
    b=b-a;
    System.out.println("After swapping: a="+(a));
    System.out.println("After swapping: b ="+(b));
    sc.close();
  }
}
