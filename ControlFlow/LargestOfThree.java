import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("The first number is largest");
        } else if (b > a && b > c) {
            System.out.println("The second number is largest");
        } else if (c > a && c > b) {
            System.out.println("The third number is largest");
        } else {
            System.out.println("All are equal");
        }
    }

}
