/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshopdesignpatterns;

/**
 *
 * @author natha
 */
public class CoffeeShopFactory{
    private static int orderID;

    public static int getOrderID() {
        return orderID;
    }

    public Coffee orderCoffee(String type){
        Coffee coffee = new SimpleCoffee(type);
        orderID++;
        return coffee;
    }
    
}
