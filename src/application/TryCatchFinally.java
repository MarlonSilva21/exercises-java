package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\default\\Documents/in.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);

            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException err){
            System.out.println("Error opening file: " + err.getMessage());
        }
        finally {
            if (sc != null){
                sc.close();
            }

        }
    }
}
