package MAy2024.ex25052024.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lab5 {
    public static void main(String[] args) throws FileNotFoundException {
        readFile("C://a.text");
    }
    //throws always works with the functions
        static void readFile(String filename) throws FileNotFoundException {
        int a= 10/10;
        int c=0;
        int a1=10/c;
            FileReader f= new FileReader(new File("C://a.text"));
//try{
       //     FileReader f= new FileReader(new File("C://a.text"));
//}catch (Exception e){
//    System.out.println("File not found");
//        }


}}
