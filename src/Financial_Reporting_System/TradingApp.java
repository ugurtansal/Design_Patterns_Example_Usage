package Financial_Reporting_System;

public class TradingApp {
    private AnalysisStrategy strategy;

    public void setStrategy(AnalysisStrategy strategy) {
        this.strategy = strategy;
    }

    public void analyzeStock(Stock stock) {
        System.out.println(strategy.analyze(stock));
    }

    public void executeCommand(TradeCommand command) {
        command.execute();
    }
}
