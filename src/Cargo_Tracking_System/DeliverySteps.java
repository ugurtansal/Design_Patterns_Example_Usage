package Cargo_Tracking_System;

 class Packing extends DeliveryHandler {
    protected void process(String packageId) {
        System.out.println("Packaging: " + packageId);
    }
}

 class Shipping extends DeliveryHandler {
    protected void process(String packageId) {
        System.out.println("Packet is leaving: " + packageId);
    }
}

 class FinalDelivery extends DeliveryHandler {
    protected void process(String packageId) {
        System.out.println("Cargo is delivering: " + packageId);
    }
}
