package MAy2024.ex25052024.exceptions;

import java.io.File;
import java.io.FileReader;

public class lab4 {
    public static void main(String[] args) {
        try{
            String path= "C://a.text";
            File file= new File(path);
            FileReader fileReader= new FileReader(file);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
