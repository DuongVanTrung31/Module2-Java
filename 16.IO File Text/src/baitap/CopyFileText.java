package baitap;

import java.io.*;


public class CopyFileText {
    public void copyFile(String source, String target) {
        File sourceFile = new File(source);
        File targetFile = new File(target);
        try {
            if(!sourceFile.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(targetFile));
            String line= "";
            int count = 0;
            while ((line = bufferedReader.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    bufferedWriter.write(line.charAt(i));
                    count++;
                }
                bufferedWriter.write("\n");
            }
            bufferedWriter.close();
            System.err.println("Số ký tự là: " + count);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
