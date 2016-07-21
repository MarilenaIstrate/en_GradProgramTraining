package Ex2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;

/**
 * Created by mistrate on 7/19/2016.
 */
public class ReversedOrderTxt {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\mistrate\\Desktop\\GradPrg\\Work\\Java\\TrIOStreams\\Homework\\TextToRead.txt";
        reversedOrder(fileName);


    }

    public static void reversedOrder(String fileName) {

        Reader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            String content = "";

            System.out.println("Textul original este:\n");

            while ((data = bufferedReader.readLine()) != null) {
               // data = "\n" + data;
                String FinalLine = "";
                String[] s = data.split(" ");
                String lastWord = s[s.length -1];

                lastWord = '\n' + lastWord;
                String FinalLastWord = lastWord.substring(0,lastWord.length());

                for(int i = 0; i < s.length - 2 ; i++){
                    FinalLine += s[i] + " ";
                }
                FinalLine +=FinalLastWord;

                content +=  FinalLine + " ";
                System.out.println(data);
            }

            //System.out.println("Textul original este:\n" + content + "\n");
            String[] words = content.split(" ");

            for(int i = words.length-1; i>=0; i--){
                System.out.print(words[i] + " ");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File missing '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("I/O Exception:" + ex.getMessage());
        } finally {
            System.out.println("   ---");
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
                System.out.println("I/O Exception:" + ex.getMessage());
            }
        }
    }
}
