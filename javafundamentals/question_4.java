import java.util.Scanner;

public class question_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextInt();
        System.out.println("The total miles is "+ km / 1.6 +" mile for the given "+ km + "km" );
    }
}
