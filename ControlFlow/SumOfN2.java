import java.util.Scanner;

public class SumOfN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The sum of "+ ((num * (num + 1)) / 2) + " natural numbers is " + num);
        }else{
            System.out.println("The number "+ num + "is not a natural number");
        }
    }
}
