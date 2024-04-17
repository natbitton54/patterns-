/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore.management;

/**
 *
 * @author natha
 */
public class XMLToCSVAdapter implements CSVText {

    XML xml;

    public XMLToCSVAdapter(XML xml) {
        this.xml = xml;
    }

    @Override
    public String getText() {
        String csv = xml.getText().substring(11, xml.getText().indexOf('/') - 1);
        return csv.replace(' ', ',');
    }

}
