/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author natha
 */
public class BasicDisplay implements Observer{
    private StockMarket stockMarket;
    
    public BasicDisplay(StockMarket stockMarket){
        this.stockMarket = stockMarket;
        this.stockMarket.sub(this);
    }

    @Override
    public void update() {
        System.out.println("Updated stock prices:");
        for (Stock stock : stockMarket.getStocks()) {
            System.out.println(stock.getStockName() + ": " + stock.getPrice());
        }
    }
}
