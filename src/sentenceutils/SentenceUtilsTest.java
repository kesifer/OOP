/*
 * University of Central Florida
 * COP3330 - Spring 2016
 * Author: Sean Pratt
 */
package sentenceutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class SentenceUtilsTest {
    
    private static List<SentenceUtils> slist = new ArrayList();
    
    public static void main(String[] args) {
    
        try {
            File file = new File( args[0]);
            
            Scanner scanner = new Scanner( new FileInputStream(file));
            
            while( scanner.hasNextLine() ) {
                String sent = scanner.nextLine();
                if( sent.trim().length() > 0 ){
                    SentenceUtils sutil = new SentenceUtils( sent );
                    slist.add( sutil );
                }
            }
            
           
            System.out.print("Sentence Utility Tester by Sean Pratt\n\nFile that was read: " + file + "\nThe file contains " + slist.size() + " sentences\n\nSentence reports: \n\n"  );
            
            Scanner scan = new Scanner( new FileInputStream(file));
            
            for(int b = 0; b < slist.size(); b++){
                String sent = scan.nextLine();
                SentenceUtils sutil = new SentenceUtils( sent );
                System.out.print("\nSentence " + b + ";\n");
                sutil.report();
                
                  
                    
          
            }
            
           
            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }
     
}


 
   
