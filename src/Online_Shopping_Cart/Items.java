package Online_Shopping_Cart;

 class Book implements CartItem {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

 class Laptop implements CartItem {
    private String name;
    private double price;

    public Laptop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}
