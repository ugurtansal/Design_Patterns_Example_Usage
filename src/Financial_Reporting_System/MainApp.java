package Financial_Reporting_System;

public class MainApp {
    public static void main(String[] args) {
        // Users (Observer)
        Investor ali = new Investor("Ali");
        Investor ayse = new Investor("Ayşe");

        // Share (Subject)
        Stock apple = new Stock("AAPL", 90);
        apple.addObserver(ali);
        apple.addObserver(ayse);

        // Price update (Observer triggered)
        apple.updatePrice(110);

        // Strategy
        TradingApp app = new TradingApp();
        app.setStrategy(new SimpleThresholdStrategy());
        app.analyzeStock(apple); // Analysis

        app.setStrategy(new RiskAverseStrategy());
        app.analyzeStock(apple); // Another analysis

        // Commands
        TradeCommand buy = new BuyStockCommand("AAPL");
        TradeCommand sell = new SellStockCommand("AAPL");

        app.executeCommand(buy);
        app.executeCommand(sell);
    }
}
