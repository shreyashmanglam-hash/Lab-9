import java.util.Scanner;
import java.io.*;

public class Text {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String src = sc.nextLine();
        int characters =0;
        int words=0;
        int lines=0;
        File file = new File(src);
        Scanner fileScanner = new Scanner(file);

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            lines++;
            characters+=line.length();

            String[] wordArray = line.trim().split("\\s");
            if (!line.trim().isEmpty()) {
                words+=wordArray.length;}
            }
        fileScanner.close();
        System.out.println("No of characters: "+characters);
        System.out.println("No of lines: "+lines);
        System.out.println("No of words: "+words);
        }
    }


