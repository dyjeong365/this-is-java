package ch18.exercise.exercise11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ClientExample {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 5001);
        OutputStream os = socket.getOutputStream();

        String filePath = "src/ch18/forest.png";
        File file = new File(filePath);

        String fileName = file.getName();
        // 클라이언트는 파일 이름이 저장된 길이 100바이트를 먼저 보냅니다.
        byte[] fileNameBytes = fileName.getBytes("UTF-8");
        fileNameBytes = Arrays.copyOf(fileNameBytes, 100);
        os.write(fileNameBytes);

        System.out.println("[파일 보내기 시작] " + fileName);
        // 이어서 파일 데이터를 보냅니다.
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[70000];
        int readByteCount;

        while ((readByteCount = fis.read(bytes)) != -1) {
            os.write(bytes, 0, readByteCount);
        }

        os.flush();
        System.out.println("[파일 보내기 완료]");

        fis.close();
        os.close();
        socket.close();
    }
}
