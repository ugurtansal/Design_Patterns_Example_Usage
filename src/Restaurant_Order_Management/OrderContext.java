package Restaurant_Order_Management;


public class OrderContext {
    private OrderState currentState;

    public OrderContext() {
        currentState = new PendingState();
    }

    public void setState(OrderState state) {
        currentState = state;
    }

    public void nextStep() {
        currentState.nextState(this);
    }

    public void showStatus() {
        System.out.println(currentState.getStatus());
    }
}


