/*
 * University of Central Florida
 * COP3330 - Spring 2016
 * Author: Sean Pratt
 */
package sentenceutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.reflect.Array.getLength;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SentenceUtils {
    
    private String sentence;
    private String[] tokens;
    private String[] shingles;
    
    public SentenceUtils( String s ) {
        
        sentence = s;
        generateTokens();
        generateShingles();
    }
    
    private void generateTokens() {
        
      Scanner scanner = new Scanner(sentence);
      String scan = scanner.toString();
      int j = scan.length();
      int i = 0;
      tokens = new String[j];
      
      while(scanner.hasNext()){
          tokens[i] = scanner.next();
          i++;
      }
     
      
    }
    
    private void generateShingles() {
    
    int k = 0;    
    int i;
    int j = sentence.length(); 
    shingles = new String[j];
    for(i=0;i<j-1;i++){
        shingles[k] = "" + sentence.charAt(i)+ "" + sentence.charAt(i+1);
            k++;
            }
    
    
    
    
    }
    
    public void report() {
       
        System.out.print(sentence + "\n"  );
        List list = Arrays.asList(tokens);
        for(int i=0;i<list.size();i++) {
            if(tokens[i]!=null){
                System.out.println(i + ":" + tokens[i]);
            }
        }
        
        for(int j=0;j<getLength(shingles);j++){
            if(shingles[j]!=null){
            System.out.print(shingles[j] + " " );
            }
        }
            
     
        
    }
}
