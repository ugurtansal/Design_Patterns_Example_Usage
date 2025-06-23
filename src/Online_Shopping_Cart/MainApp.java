package Online_Shopping_Cart;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // Creating items
        CartItem book1 = new Book("The Lord of the Rings", 150);
        CartItem laptop1 = new Laptop("Lenovo X1", 1800);

        List<CartItem> cart = new ArrayList<>();
        cart.add(book1);
        cart.add(laptop1);

        //Selecting strategy
        PricingStrategy strategy = new PercentageDiscount(10); // %10 indirim
        Visitor discountVisitor = new DiscountApplier(strategy);

        System.out.println("Cart items and discounted prices:");
        for (CartItem item : cart) {
            item.accept(discountVisitor);
        }

        // Command
        Command buy = new PurchaseCommand(cart);
        buy.execute();

        // Delete an item
        Command remove = new RemoveItemCommand(cart, book1);
        remove.execute();
    }
}
