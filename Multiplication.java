import java.util.Scanner;

public class Multiplication {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int number=sc.nextInt();
    for(int i=0;i<=10;i++){
      
      System.out.println(number + "*" + i +"="+(number*i));

    }
    sc.close();
  }
}
