/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshopdesignpatterns;

import java.util.*;

/**
 *
 * @author natha
 */
public class CoffeeView {

    CoffeeShopFactory shop;

    public CoffeeView(CoffeeShopFactory shop) {
        this.shop = shop;
    }

    public void buyCoffee() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("What type of coffee would u like?");
            String coffeeType = scan.nextLine();
            Coffee coffee = shop.orderCoffee(coffeeType);
            System.out.println("Would you like to add milk?");
            if (!scan.nextLine().equals("n")) {
                coffee = new Milk(coffee);
                System.out.println("Would you like to add sugar?");
                if (!scan.nextLine().equals("n")) {
                    coffee = new Sugar(coffee);
                    System.out.println("Order #" + shop.getOrderID() + "\n Coffee Type: " + coffee.getType() + " Order Total: " + coffee.getPrice());
                } else {
                    System.out.println("Order #" + shop.getOrderID() + "\n Coffee Type: " + coffee.getType() + " Order Total: " + coffee.getPrice());
                }
            } else {
                System.out.println("Would you like to add some sugar?");
                if (!scan.nextLine().equals("n")) {
                    coffee = new Sugar(coffee);
                    System.out.println("Order #" + shop.getOrderID() + "\n Coffee Type: " + coffee.getType() + " Order Total: " + coffee.getPrice());
                } else {
                    System.out.println("Order #" + shop.getOrderID() + "\n Coffee Type: " + coffee.getType() + " Order Total: " + coffee.getPrice());
                }
            }
            System.out.println("Would you like something else");
            if (scan.nextLine().equals("n")) {
                System.out.println("Thanks for shopping with us!!!!!!!!!!!!!");
                break;
            }
        }
    }
}
