/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshopdesignpatterns;

/**
 *
 * @author natha
 */
public class SimpleCoffee implements Coffee {

    private String type;
    private int cost = 2;

    public SimpleCoffee(String type) {
        this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public int getPrice() {
        return this.cost;
    }
}
