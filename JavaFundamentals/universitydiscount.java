public class universitydiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent = 10;

        double discount = (discountPercent / 100.0) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
