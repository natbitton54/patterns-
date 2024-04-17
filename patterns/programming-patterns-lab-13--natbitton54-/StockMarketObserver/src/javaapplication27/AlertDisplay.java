/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author natha
 */
public class AlertDisplay implements Observer {

    private StockMarket stockMarket;
    private final double threshold = 0.05;

    public AlertDisplay(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        this.stockMarket.sub(this);
    }

    @Override
    public void update() {
        for (Stock stock : stockMarket.getStocks()) {
            double initialPrice = stock.getInitialPrice();
            double price = stock.getPrice();

            double priceChange = Math.abs(price - initialPrice) / initialPrice;
            if (priceChange > threshold) {
                System.out.println("Alert: Significant price change for " + stock.getStockName()
                        + " from " + initialPrice + " to " + price);
            }
        }
    }

}
