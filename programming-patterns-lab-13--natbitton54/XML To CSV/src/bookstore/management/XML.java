/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore.management;

/**
 *
 * @author natha
 */
public class XML {
    String text;

    public XML(String text) {
        this.text = text;
    }
    
    public String getText(){
        return "<xml><text>" + text +"</text> </xml>";
    }
}
