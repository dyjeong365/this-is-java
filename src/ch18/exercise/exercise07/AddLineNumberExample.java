package ch18.exercise.exercise07;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
    public static void main(String[] args) throws Exception {
        String filePath = "src/ch18/BufferedReaderExample.java";

        //작성 위치
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        int lineNumber = 1;
        String data;

        while ((data = br.readLine()) != null) {
            System.out.println(lineNumber++ + ": " + data);
        }

        fr.close();
        br.close();
    }
}
