import java.util.Scanner;
public class question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter a number for countdown: ");
        int num = sc.nextInt();
        while(num != 0){
            System.out.println("Rocket launching in : " + num--);
            if(num == 0){
                System.out.println("Rocket launched");
            }
        }
    }
}
