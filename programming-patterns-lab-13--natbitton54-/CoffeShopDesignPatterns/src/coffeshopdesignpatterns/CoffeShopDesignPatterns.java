/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeshopdesignpatterns;

/**
 *
 * @author natha
 */
public class CoffeShopDesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CoffeeShopFactory shop = new CoffeeShopFactory();
        CoffeeView view = new CoffeeView(shop);
        view.buyCoffee();
    }
    
}
