import java.util.Scanner;
import java.io.*;

public class Equals {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file 1: ");
        String file1 = sc.nextLine();
        System.out.println("Enter file 2: ");
        String file2 = sc.nextLine();
        FileInputStream fi1 = new FileInputStream(file1);
        FileInputStream fi2 = new FileInputStream(file2);
        int byt1,byt2;
        int pos=0;
        boolean areEqual = true;
        while (true) {
            byt1 = fi1.read();
            byt2 = fi2.read();

            if (byt1 ==-1 && byt2==-1) {
                break;
            }
            if (byt1 != byt2) {
                areEqual = false;
                System.out.println("Two files are not equal\nbByte position at which two files differ is: "+pos);
                break;
            }
            pos++;
        }
        if (areEqual) {
            System.out.println("Two files are equal"); }
        }

        }


