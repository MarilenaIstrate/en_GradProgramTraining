package Ex1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by mistrate on 7/19/2016.
 */
public class RandomCount {
        public static int counter = 0;

        public static void main(String[] args) {
            String fileName = "C:\\Users\\mistrate\\Desktop\\GradPrg\\Work\\Java\\TrIOStreams\\Homework\\TextToRead.txt";
            readWithRandomAccessFile(fileName);
        }

        public static void readWithRandomAccessFile(String fileName) {
            RandomAccessFile randomAccessFile = null;
            try {
                randomAccessFile = new RandomAccessFile(fileName, "r");
                randomAccessFile.seek(6L);
                int data;
                while ((data = randomAccessFile.read()) != -1) {
                    char dataChar = (char) data;
                    if (dataChar == 'a'){ counter++;}
                    //System.out.print(dataChar);
                }
                System.out.println(counter);
            } catch (FileNotFoundException ex) {
                System.out.println("File missing '" + fileName + "'");
            } catch (IOException ex) {
                System.out.println("I/O Exception:" + ex.getMessage());
            } finally {
                try {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException ex) {
                    System.out.println("I/O Exception:" + ex.getMessage());
                }
            }
        }

}

