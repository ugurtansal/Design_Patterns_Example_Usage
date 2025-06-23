package Cargo_Tracking_System;

public abstract class DeliveryHandler {
    protected DeliveryHandler next;

    public void setNext(DeliveryHandler next) {
        this.next = next;
    }

    public void handle(String packageId) {
        process(packageId);
        if (next != null) next.handle(packageId);
    }

    protected abstract void process(String packageId);
}
