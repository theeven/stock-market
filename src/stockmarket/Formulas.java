/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarket;

import java.util.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author panchal
 */
public class Formulas {
    ReadFiles rf = new ReadFiles();
    float[][] dataArray = new float[rf.findRowNum()][7];
    Date[] dateArray = new Date[rf.findRowNum()];
    
    // create date array, just the first column in date type format.
    public void createDateArray(String[][] n) {
        SimpleDateFormat df =  new SimpleDateFormat("yyyy-MM-dd");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (j == 0) {
                    try {
                        Date newdate = (Date)df.parse(n[i][j]);
                        dateArray[i] = newdate;
                    }
                    catch(Exception e) {
                        System.out.println(e);
                    }
                }
            }
        }
    }
    
    // create data array for rest of the elements.
    public void createDataArray(String[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                switch(j) {
                    case 0:
                        dataArray[i][j] = 0;
                        break;
                    case 1:
                        dataArray[i][j] = new Float(n[i][j]);
                        break;
                    case 2:
                        dataArray[i][j] = new Float(n[i][j]);
                        break;
                    case 3:
                        dataArray[i][j] = new Float(n[i][j]);
                        break;
                    case 4:
                        dataArray[i][j] = new Float(n[i][j]);
                        break;
                    case 5:
                        dataArray[i][j] = new Float(n[i][j]);
                        break;
                    case 6:
                        dataArray[i][j] = new Float(n[i][j]);
                        break;
                    case 7:
                        dataArray[i][j] = new Float(n[i][j]);
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
