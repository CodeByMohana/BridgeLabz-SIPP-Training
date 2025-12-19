import java.util.Scanner;

public class RocketLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for countdown: ");
        int num = sc.nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.println("Rocket launching in : " + i);
            if(i == 0){
                System.out.println("Rocket launched");
            }
        }
    }
}
