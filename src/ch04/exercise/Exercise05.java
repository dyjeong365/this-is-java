package ch04.exercise;

public class Exercise05 {
    public static void main(String[] args) {
        //중첩for, 4x+5y=60의 모든 해, (x,y) 형태 출력, x,y<=10

//        for (int x = 1; x <= 10; x++) {
//            int result = 60;
//            result -= (4 * x);
//            for (int y = 1; y <= 10; y++) {
//                if (result - (5 * y) == 0) System.out.printf("(%d, %d)\n", x, y);
//            }
//        }

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) System.out.printf("(%d, %d)\n", x, y);
            }
        }
    }
}
