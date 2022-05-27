package Daily_study_example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ch15_io {
    public static void main(String[] args) {
        // 읽어오기
        try {
            FileInputStream fileInput = new FileInputStream("inputtest.txt");
            int i = 0;
            while ((i = fileInput.read()) != -1) { //fileInput.read()의 리턴값을 i에 저장한 후, 값이 -1인지 확인합니다.
                System.out.print((char)i);
            }
            fileInput.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }

        // 쓰기
        try {
            FileOutputStream fileOutput = new FileOutputStream("inputtest.txt");
            String word = "code1";

            byte b[] = word.getBytes();
            fileOutput.write(b);
            fileOutput.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
