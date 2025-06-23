package Online_Shopping_Cart;

public class DiscountApplier implements Visitor {
    private PricingStrategy strategy;

    public DiscountApplier(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void visit(Book book) {
        double finalPrice = strategy.calculate(book.getPrice());
        System.out.println("Book: " + book.getName() + " → Discounted Price: " + finalPrice);
    }

    public void visit(Laptop laptop) {
        double finalPrice = strategy.calculate(laptop.getPrice());
        System.out.println(" Laptop: " + laptop.getName() + " → Discounted Price: " + finalPrice);
    }
}
