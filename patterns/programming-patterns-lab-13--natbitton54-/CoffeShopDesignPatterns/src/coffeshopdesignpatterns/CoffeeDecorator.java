/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshopdesignpatterns;

/**
 *
 * @author natha
 */
public abstract class CoffeeDecorator implements Coffee {

    Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    
    

    @Override
    public String getType() {
       return coffee.getType();
    }

    @Override
    public int getPrice() {
        return coffee.getPrice();
    }

}
