/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homehubexample;

/**
 *
 * @author natha
 */
public class HomeHubExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HomeHub hb = new HomeHub();
        Observer o = new SecurityCam();
        Observer ob = new SmartLight();
        SmartThermo oba = new SmartThermo();
        hb.register(ob);
        hb.register(oba);
        hb.register(o);
        hb.personSpotted();
        
        hb.addThermo(oba);
        hb.changeTemp(4);
    }
    
}
