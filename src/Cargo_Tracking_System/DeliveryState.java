package Cargo_Tracking_System;

public interface DeliveryState {
    void next(DeliveryContext ctx);
    String getStatus();
}
