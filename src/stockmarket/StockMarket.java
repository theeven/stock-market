/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarket;

/**
 *
 * @author panchal
 */
public class StockMarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReadFiles r = new ReadFiles();
        System.out.println(r.checkIsFile());
        System.out.println(r.findRowNum());
        r.printArray();
    }
}
