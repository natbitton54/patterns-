/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author natha
 */
class Stock {
    private String stockName;
    private double price;
    private double initialPrice;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.initialPrice = price;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

}
