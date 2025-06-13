public class question_5 {
    public static void main(String[] args) {

        int fee = 125000;
        int discount_percent = 10;
        int discount = (fee * discount_percent) / 100;
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + (fee - discount));
    }
}  

