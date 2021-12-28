package BT_Optional;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/BT_Optional/tex1");
        File file2 = new File("src/BT_Optional/text2");
        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file2));
            byte read;
            int count = 0;
            while ((read = (byte) inputStream.read()) != -1) {
                outputStream.write(read);
                count++;
            }
            outputStream.close();
            System.out.println(count);
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
