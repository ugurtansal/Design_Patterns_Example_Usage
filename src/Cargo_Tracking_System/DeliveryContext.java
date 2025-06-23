package Cargo_Tracking_System;

public class DeliveryContext {
    private DeliveryState state;

    public DeliveryContext() {
        this.state = new PreparedState(); // default state
    }

    public void setState(DeliveryState state) {
        this.state = state;
    }

    public void proceed() {
        state.next(this);
    }

    public void showStatus() {
        System.out.println("Status: " + state.getStatus());
    }
}
