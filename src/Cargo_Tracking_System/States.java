package Cargo_Tracking_System;

 class PreparedState implements DeliveryState {
    public void next(DeliveryContext ctx) {
        ctx.setState(new ShippedState());
    }

    public String getStatus() {
        return "Getting ready...";
    }
}

 class ShippedState implements DeliveryState {
    public void next(DeliveryContext ctx) {
        ctx.setState(new DeliveredState());
    }

    public String getStatus() {
        return "On the road...";
    }
}

 class DeliveredState implements DeliveryState {
    public void next(DeliveryContext ctx) {
        System.out.println("Already delivered.");
    }

    public String getStatus() {
        return "Delivered.";
    }
}
