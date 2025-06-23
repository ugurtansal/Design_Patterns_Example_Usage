package Restaurant_Order_Management;

public abstract class OrderHandler {
    protected OrderHandler next;

    public void setNext(OrderHandler next) {
        this.next = next;
    }

    public abstract void handle(String order, OrderContext context);
}
 class Waiter extends OrderHandler {
    public void handle(String order, OrderContext context) {
        System.out.println("Waiter handles: " + order);
        if (next != null) next.handle(order, context);
    }
}

 class Chef extends OrderHandler {
    private CookingStrategy strategy;

    public Chef(CookingStrategy strategy) {
        this.strategy = strategy;
    }

    public void handle(String order, OrderContext context) {
        strategy.cook(order);
        context.nextStep(); //State is Preparing
        if (next != null) next.handle(order, context);
    }
}

 class Delivery extends OrderHandler {
    public void handle(String order, OrderContext context) {
        System.out.println("Order is delivered: " + order);
        context.nextStep(); // State is Delivered
    }
}
