import java.io.File;

public class File_d2d {
    public static void main(String[] args) {
        File f1 = new File("File_d2d.java");
        System.out.println("File name:" + f1.getName());
        System.out.println("path:" + f1.getPath());
        System.out.println("Abs path:" + f1.getAbsolutePath());
        System.out.println("Parent file: " + f1.getParent());
        System.out.println("file size:" + f1.length() + "Bytes");
        System.out.println("Last modified:" + f1.lastModified());

    }
}
