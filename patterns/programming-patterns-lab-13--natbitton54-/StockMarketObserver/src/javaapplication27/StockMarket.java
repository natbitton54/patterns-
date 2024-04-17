/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication27;

import java.util.ArrayList;

/**
 *
 * @author natha
 */
public class StockMarket implements StockSubject {

    private ArrayList<Observer> observer = new ArrayList();
    private ArrayList<Stock> stocks = new ArrayList();

    @Override
    public void sub(Observer o) {
        observer.add(o);
    }

    @Override
    public void unSub(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observer) {
            o.update();
        }
    }

    public void stock(String stockName, double price) {
        for (Stock stock : stocks) {
            if (stock.getStockName().equals(stockName)) {
                if (stock.getPrice() != price) {
                    stock.setPrice(price);
                    notifyObserver();
                }
                return;
            }
        }
        stocks.add(new Stock(stockName, price));
        notifyObserver();
    }

    public ArrayList<Stock> getStocks() {
        return stocks;
    }
}
