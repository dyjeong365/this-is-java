package ch12.exercise.exercise08;

public class MovieThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("동영상을 재생합니다.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("동영상을 중지합니다.");
                break;
            }
            ;
        }
    }
}
