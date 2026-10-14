public class Receipt {
    public static void main(String[] args) {
        /* Create a new file in com.pluralsight named Receipt.java structured as
        Create variables for an item name (String) and item price (double)
        2. Create a quantity variable (int)
        3. Build and print: EX. "You bought 3 apples for $7.10" */

        String itemName = "Footballs";
        double itemPrice = 20.99;
        int totalFootballs = 5;
        int quantity = 5;
        System.out.println("I bought" + ' ' + totalFootballs + ' ' + itemName + ' ' + "for" + ' ' + '$' + itemPrice);

        // with quantity * itemPrice
        System.out.println(("I bought" + ' ' + totalFootballs + ' ' + itemName + ' ' + "for" + ' ' + '$' + quantity * itemPrice));

    }
}