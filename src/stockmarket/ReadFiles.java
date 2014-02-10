/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmarket;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author panchal
 */
public class ReadFiles {
    // This class pretty much reads the file & tries to verify it.
    File file = new File("./yhoo.csv");
    int row = 0;
    String[][] items;
    
    // Check if the file is a file.
    public boolean checkIsFile() {
        return file.isFile();
    }
    
    // Find number of row in csv file.
    public int findRowNum() {
        row = 0;
        if (checkIsFile()) {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                while (reader.readLine() != null) {
                    row++;
                }
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        else {
            System.out.println("This is not a file");
        }
        return row;
    }
    
    // Converts csv file to an array.
    public void convertToArray() {
        int r = 0;
        items = new String[findRowNum()][7];
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            
            while ((line = reader.readLine()) != null) {
                // String Tokenizer class is inbuilt which is imported, it 
                // basically takes string as an input & tries to create small
                // tokens based on delimited provided. in out case, string is 
                // "line = reader.readLine" & delimited is comma.
                StringTokenizer st = new StringTokenizer(line, ",");
                while (st.hasMoreTokens()) {
                    for (int c = 0; c < 7 ; c++) {
                        items[r][c] = st.nextToken();
                    }
                }
                r++;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
    // Print items array
    public void printArray() {
        convertToArray();
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%s\t", i);
            for (int j = 0; j < items[i].length; j++) {
                System.out.printf("%s ", items[i][j]);
            }
            System.out.println();
        }
    }
    
    // Return Array
    public String[][] returnArray() {
        convertToArray();
        return items;
    }
}
