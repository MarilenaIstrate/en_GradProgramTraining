package Ex1;

import java.io.*;

/**
 * Created by mistrate on 7/19/2016.
 */
public class CountChar {


    public static void main(String[] args) {

        String fileName = "C:\\Users\\mistrate\\Desktop\\GradPrg\\Work\\Java\\TrIOStreams\\Homework\\TextToRead.txt";
        CountCharFile(fileName);

    }

    public static void CountCharFile(String fileName) {
        //read the file
        // try-with-resources
        int counter = 0;
        try (FileReader fileReader = new FileReader(fileName)) {
            int data;
            while ((data = fileReader.read()) != -1) {
                char dataChar = (char) data;
                if (dataChar == 'a'){counter++;}
                System.out.print(dataChar);
            }
            System.out.println("\nNumarul de aparitii a lui a este:" + counter);
        } catch (FileNotFoundException ex) {
            System.out.println("File missing '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("I/O Exception:" + ex.getMessage());
        }
        System.out.println("   ---");
    }


    }


