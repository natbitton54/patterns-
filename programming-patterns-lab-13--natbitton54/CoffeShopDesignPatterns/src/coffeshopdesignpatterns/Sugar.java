/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshopdesignpatterns;

/**
 *
 * @author natha
 */
public class Sugar extends CoffeeDecorator{
    
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }

    @Override
    public String getType() {
        return super.getType() + ", With sugar";
    }
    
    
    
}
