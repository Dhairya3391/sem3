import java.io.FileOutputStream;

public class Fileoutdemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("jay.txt");
            String s = "i am a programmer";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success..........");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
