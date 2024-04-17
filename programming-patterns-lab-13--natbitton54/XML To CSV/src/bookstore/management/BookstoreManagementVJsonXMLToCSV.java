/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bookstore.management;

/**
 *
 * @author natha
 */
public class BookstoreManagementVJsonXMLToCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CSVText csv = new XMLToCSVAdapter(new XML("Nat loves niggas bitch"));
        System.out.println(csv.getText());
    }
    
}
