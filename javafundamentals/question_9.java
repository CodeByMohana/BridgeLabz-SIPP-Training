import java.util.Scanner;

public class question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double cm = sc.nextInt();
        double inches = cm / 2.54;
        double feet = inches / 12;
        System.out.println("Your Height in cm is " + cm + "while in feet is " + feet + "and inches is " + inches);
    }
}
