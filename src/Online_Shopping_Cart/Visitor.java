package Online_Shopping_Cart;

public interface Visitor {
    void visit(Book book);
    void visit(Laptop laptop);
}
