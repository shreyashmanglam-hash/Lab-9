import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file name: ");
        String src = sc.nextLine();
        System.out.println("Enter destination file name: ");
        String dest = sc.nextLine();

        FileReader fr = new FileReader(src);
        FileWriter fw = new FileWriter(dest);
        int ch;
        while ((ch=fr.read())!=-1) {
            fw.write(ch);
        }
        fr.close();
        fw.close();
        System.out.println("File contents copied");

    }
}
