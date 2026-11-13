//multiple inheritance
import java.util.Scanner;

interface Printable {
    void printDocument(String doc);
}

interface Scannable {
    void scanDocument(String doc);
}

class MultiFunctionPrinter implements Printable, Scannable {
    public void printDocument(String doc) { System.out.println("Printing " + doc); }
    public void scanDocument(String doc) { System.out.println("Scanning " + doc); }
}

public class mul_inherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d1 = sc.next();
        String d2 = sc.next();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        Printable p = mfp;
        Scannable s = mfp;
        p.printDocument(d1);
        s.scanDocument(d2);
    }
}