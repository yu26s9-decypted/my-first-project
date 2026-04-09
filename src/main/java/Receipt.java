public class Reciept {
    public static void main(String[] args) {
        System.out.println("Welcome to the Reciept Printer");

        int itemQuantitiy = 4;
        String itemName = "Macbook Pro";
        double ItemPrice = 1299.99;

        double totalPrice = itemQuantitiy * ItemPrice;

        IO.println(
                "You've purchased "
                + itemQuantitiy + " of the product " + itemName
                + " for the price of $" + totalPrice);
    }
}
