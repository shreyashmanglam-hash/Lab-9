import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Student {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String file = sc.nextLine();
        System.out.println("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter subject: ");
        String subject = sc.nextLine();
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        FileWriter fw = new FileWriter(" "+file);
        fw.write("Roll number: " + roll + "\n");
        fw.write("Name: " + name + "\n");
        fw.write("Subject: " + subject + "\n");
        fw.write("Marks: " + marks);
        fw.close();

        FileReader fr = new FileReader(" "+file);
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();
    }
}
