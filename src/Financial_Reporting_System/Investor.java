package Financial_Reporting_System;

public class Investor {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public void notify(String stock, double price) {
        System.out.println( name + ", " + stock + " new price: $" + price);
    }
}
