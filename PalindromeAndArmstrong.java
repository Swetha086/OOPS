import java.util.Scanner;

public class PalindromeAndArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;
        int sumOfCubes = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            sumOfCubes = sumOfCubes + (digit * digit * digit);
            num = num / 10;
        }

        System.out.println("Reversed Number: " + reversed);

        if (original == reversed) {
            System.out.println(original + " is a Palindrome number.");
        } else {
            System.out.println(original + " is not a Palindrome number.");
        }

        if (original == sumOfCubes) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
        sc.close();
    }
}