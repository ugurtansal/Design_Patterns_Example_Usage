package Cargo_Tracking_System;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainSystem {
    public static void main(String[] args) {
        String packageId = "KARGO123";

        // Chain of Responsibility
        Packing packing = new Packing();
        Shipping shipping = new Shipping();
        FinalDelivery delivery = new FinalDelivery();
        packing.setNext(shipping);
        shipping.setNext(delivery);

        System.out.println("Delivery Process:");
        packing.handle(packageId);

        // State Pattern
        DeliveryContext ctx = new DeliveryContext();
        ctx.showStatus(); // Preparing
        ctx.proceed();
        ctx.showStatus(); // Routing
        ctx.proceed();
        ctx.showStatus(); // Delivered
        ctx.proceed();    // Cannot proceed, already delivered

        // Iterator Pattern
        String[] steps = {
                "Order placed",
                "Begin packing",
                "Cargo is ready for shipping",
                "Delivered",
        };
        StepIterator collection = new StepIterator(steps);
        IStepIterator iterator = collection.createIterator();

        System.out.println("Cargo delivery steps:");
        while (iterator.hasNext()) {
            System.out.println("➡️ " + iterator.next());
        }
    }
}
