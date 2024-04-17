package javaapplication27;

public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of the StockMarket
        StockMarket market = new StockMarket();

        // Create display observers
        Observer basicDisplay = new BasicDisplay(market);
        Observer alertDisplay = new AlertDisplay(market);

        // Subscribe the observers to the market
        market.sub(basicDisplay);
        market.sub(alertDisplay);

        // Simulate updating stock prices
        market.stock("Apple", 1000);  // Initial price setting
        market.stock("Apple", 950);   // Decrease in price, might not trigger alert based on threshold
        market.stock("Apple", 1055);  // Increase in price, should trigger alert if threshold is surpassed

        // Further simulation of another stock
        market.stock("Google", 1500); // Initial price setting
        market.stock("Google", 1575); // Increase, likely to trigger the alert
    }
}
