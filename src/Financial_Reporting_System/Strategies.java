package Financial_Reporting_System;

 class SimpleThresholdStrategy implements AnalysisStrategy {
    @Override
    public String analyze(Stock stock) {
        if (stock.getPrice() > 100)
            return "High price: Sell is not a good idea.";
        else
            return "Low price: Buy is a good idea.";
    }
}

 class RiskAverseStrategy implements AnalysisStrategy {
    @Override
    public String analyze(Stock stock) {
        if (stock.getPrice() > 150)
            return "Very high price: Buy is not a good idea.";
        else
            return "Watching.";
    }
}
