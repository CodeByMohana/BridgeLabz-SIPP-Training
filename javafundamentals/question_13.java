import java.util.Scanner;
public class question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0 , b = 0, c = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int result1 = a + b * c;         
        int result2 = a * b + c;         
        int result3 = c + a / b;
        int result4 = a % b + c;         
                
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        
    }
}
