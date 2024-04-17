/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homehubexample;

/**
 *
 * @author natha
 */
public class SmartThermo implements Observer{

    @Override
    public void update() {
        
    }
    public void tempUpdate(int temp){
        System.out.println("The new temperature is " + temp + 'c');
    }
}
