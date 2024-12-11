
//Copy_charstream_demo
import java.io.*;

public class Copy_charstream_demo {
    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("jaydave.txt");
        Reader r = new FileReader("jd.txt");
        int data = 0;
        while ((data = r.read()) != -1) {
            w.write((char) data);
        }
        r.close();
        w.close();
    }
}
