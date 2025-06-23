package Restaurant_Order_Management;

public class PendingState implements OrderState {
    public void nextState(OrderContext context) {
        context.setState(new PreparingState());
    }

    public String getStatus() {
        return "Order is pending.";
    }
}



