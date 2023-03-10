package ch05.Exercise;

public class Exercise08 {
    public static void main(String[] args) {
        int[][] arrays = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for (int i = 0; i < arrays.length; i++) {
            count += arrays[i].length;
            for (int j = 0; j < arrays[i].length; j++) {
                sum += arrays[i][j];
            }
        }

        avg = (double) sum / count;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
