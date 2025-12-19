import java.util.Scanner;
public class SignOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check wether it is +ve, -ve or 0 : ");
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("Positive number");
        }else if(number < 0){
            System.out.println("Negative number");
        }else{
            System.out.println("It's a zero");
        }
    }
}
