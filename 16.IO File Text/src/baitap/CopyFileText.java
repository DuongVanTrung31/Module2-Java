package baitap;

import java.io.*;


public class CopyFileText {
    public void copyFile(String source, String target) {
        File sourceFile = new File(source);
        File targetFile = new File(target);
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            if(!sourceFile.exists()){
                throw new FileNotFoundException();
            }
            bufferedReader = new BufferedReader(new FileReader(sourceFile));
            bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            int line;
            int count = 0;
            while ((line = bufferedReader.read()) != -1){
                bufferedWriter.write((char) line);// Enter xuống dòng tính là 2 ký tự
                count++;
            }
            System.err.println("Số ký tự là: " + count);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            if(bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
