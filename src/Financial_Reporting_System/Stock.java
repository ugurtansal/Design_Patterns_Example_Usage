package Financial_Reporting_System;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private double price;
    private List<Investor> observers = new ArrayList<>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addObserver(Investor investor) {
        observers.add(investor);
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    public void notifyObservers() {
        for (Investor i : observers) {
            i.notify(name, price);
        }
    }

    public double getPrice() {
        return price;
    }
}
