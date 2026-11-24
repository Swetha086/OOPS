import java.util.Scanner;

public class simpleCal {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number:");
    int a= sc.nextInt();
    System.out.println("Enter operator");
    char opt= sc.next().charAt(0);
    System.out.println("Enter next number:");
    int b=sc.nextInt();
    switch(opt){
      case '+':
        System.out.println("solution:"+(a+b));
        break;
      case '-':
        System.out.println("solution:" + (a - b));
        break;
      case '*':
        System.out.println("solution:" + (a * b));
        break;
      case '/':
        System.out.println("solution:" + (a / b));
        break;
      default:
        System.out.println("Invalid operator");
    }
    sc.close();
  }
}
