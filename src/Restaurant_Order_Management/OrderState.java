package Restaurant_Order_Management;

public interface OrderState {
    void nextState(OrderContext context);
    String getStatus();
}

