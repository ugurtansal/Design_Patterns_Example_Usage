package Online_Shopping_Cart;

public interface CartItem {
    void accept(Visitor visitor);
    String getName();
    double getPrice();
}
