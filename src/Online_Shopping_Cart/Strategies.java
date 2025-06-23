package Online_Shopping_Cart;

 class PercentageDiscount implements PricingStrategy {
    private double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    public double calculate(double price) {
        return price * (1 - percent / 100);
    }
}

 class FlatDiscount implements PricingStrategy {
    private double amount;

    public FlatDiscount(double amount) {
        this.amount = amount;
    }

    public double calculate(double price) {
        return Math.max(0, price - amount);
    }
}
