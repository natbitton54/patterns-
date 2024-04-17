/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homehubexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author natha
 */
public class HomeHub implements Subject {

    List<Observer> observer = new ArrayList();
    SmartThermo thermo;
    
    public void addThermo(SmartThermo thermo){
        this.thermo = thermo;
    }

    @Override
    public void register(Observer o) {
        observer.add(o);
    }

    @Override
    public void unRegister(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer1 : observer) {
            observer1.update();
        }
    }

    public void personSpotted() {
        notifyObserver();
    }

    public void changeTemp(int temp) {
        try {
            thermo.tempUpdate(temp);
        } catch (NullPointerException e) {
            System.out.println("Sorry you dont have a thermostat broke ass nigga");
        }
    }
}
