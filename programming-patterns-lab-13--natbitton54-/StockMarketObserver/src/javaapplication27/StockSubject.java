/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author natha
 */
public interface StockSubject {
    void sub(Observer o);
    void unSub(Observer o);
    void notifyObserver();
}
