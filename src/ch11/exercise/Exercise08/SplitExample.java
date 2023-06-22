package ch11.exercise.Exercise08;

import java.util.StringTokenizer;

public class SplitExample {
    public static void main(String[] args) {
        String str = "아이디,이름,패스워드";

        //방법1 (split() 메서드 이용)
        String[] privacy = str.split(",");
        for (String detail : privacy) {
            System.out.println(detail);
        }
        System.out.println();

        //방법2 (StringTokenizer 이용)
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken(","));
        }

    }
}
