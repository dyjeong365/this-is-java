package ch18.exercise.exercise11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.bind(new InetSocketAddress("localhost", 5001));

        System.out.println("[서버 시작]");

        while (true) {
            try {
                Socket socket = serverSocket.accept();

                InputStream is = socket.getInputStream();

                byte[] bytes = new byte[70000];
                int readByteCount = -1;

                // 클라이언트가 보낸 100바이트를 먼저 읽고 파일 이름을 얻어냅니다.
                is.read(bytes, 0, 100);
                String fileName = new String(bytes, 0, 100, "UTF-8");
                fileName = fileName.trim();

                System.out.println("[파일 받기 시작] " + fileName);
                // 이어서 파일 데이터를 받고 /Users/{username}/temp 폴더에 저장합니다.
                FileOutputStream fos = new FileOutputStream("/Users/{username}/temp/" + fileName);

                while ((readByteCount = is.read(bytes)) != -1) {
                    fos.write(bytes, 0, readByteCount);
                }

                fos.flush();
                System.out.println("[파일 받기 완료]");

                fos.close();
                is.close();
                socket.close();
            } catch (Exception e) {
                break;
            }
        }

        serverSocket.close();
        System.out.println("[서버 종료]");
    }
}
