package ch11.Exercise.Exercise12;

public class StringConvertExample {
    public static void main(String[] args) {
        String strData1 = "200";
        int intData1 = Integer.parseInt(strData1);

        int intData2 = 150;
//        String strData2 = "" + intData2;
        String strData2 = String.valueOf(intData2);
    }
}
