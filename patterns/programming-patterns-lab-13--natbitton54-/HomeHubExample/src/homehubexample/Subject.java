/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package homehubexample;

/**
 *
 * @author natha
 */
public interface Subject {
    public void register(Observer o);
    public void unRegister(Observer o);
    public void notifyObserver();
}
