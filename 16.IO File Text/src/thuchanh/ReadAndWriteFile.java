package thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = readAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true );
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}

