package ch04.exercise;

public class Exercise04 {
    public static void main(String[] args) {
        //while, math.random (눈1,눈2) 형태 합이 5
        while (true) {
            int first = (int) (Math.random() * 6) + 1;
            int second = (int) (Math.random() * 6) + 1;
            System.out.printf("(%d, %d)\n", first, second);
            if (first + second == 5) break;
        }

    }
}
