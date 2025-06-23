package Restaurant_Order_Management;

public class DeliveredState implements OrderState {
    public void nextState(OrderContext context) {
        System.out.println("Order is delivered and cannot be changed.");
    }

    public String getStatus() {
        return "Order is delivered.";
    }
}