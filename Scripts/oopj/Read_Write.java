import java.io.*;

class Read_Write {
    public static void main(String s[]) {
        Reader r1 = FileReader("d2d.txt");
        Writer w1 = new FileWriter("d2d2.txt");

        int data = 0;
        data = r1.read();
        while (data != -1) {
            w1.write((char) data);
        }
        if (r1 == null) {
            r1.close();
        }
        if (w1 == null) {
            w1.close();
        }

    }
}