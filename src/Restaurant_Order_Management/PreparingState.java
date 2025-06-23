package Restaurant_Order_Management;

public class PreparingState implements OrderState {
    public void nextState(OrderContext context) {
        context.setState(new DeliveredState());
    }

    public String getStatus() {
        return "Order is being prepared.";
    }
}
