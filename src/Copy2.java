import java.util.Scanner;
import java.io.*;


public class Copy2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String src = sc.nextLine();
        System.out.println("Enter destination file: ");
        String dest = sc.nextLine();
        FileInputStream fi = new FileInputStream(src);
        FileOutputStream fs = new FileOutputStream(dest);
        int ch;
        while ((ch=fi.read())!=-1) {
            fs.write(ch);
        }
        fi.close();
        fs.close();
        System.out.println("File Contents copied");
    }
}
