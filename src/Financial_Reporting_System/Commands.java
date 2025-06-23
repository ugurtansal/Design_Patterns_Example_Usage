package Financial_Reporting_System;

 class BuyStockCommand implements TradeCommand {
    private String stockName;

    public BuyStockCommand(String stockName) {
        this.stockName = stockName;
    }

    public void execute() {
        System.out.println(stockName + " shares were purchased.");
    }
}

 class SellStockCommand implements TradeCommand {
    private String stockName;

    public SellStockCommand(String stockName) {
        this.stockName = stockName;
    }

    public void execute() {
        System.out.println(stockName + " shares sold.");
    }
}
