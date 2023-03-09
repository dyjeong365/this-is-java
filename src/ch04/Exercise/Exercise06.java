package ch04.Exercise;

public class Exercise06 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i != 0) System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
        }
    }
}
