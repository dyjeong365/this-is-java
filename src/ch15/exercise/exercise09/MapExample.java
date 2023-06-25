package ch15.exercise.exercise09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0, totalScore = 0;

//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//
//            totalScore += value;

//            if (maxScore < value) {
//                maxScore = value;
//                name = key;
//            }
//        }

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            totalScore += value;

            if (maxScore < value) {
                maxScore = value;
                name = key;
            }
        }

        int avgScore = totalScore / map.size();

        System.out.println("평균점수: " + avgScore);
        System.out.println("최고점수: " + maxScore);
        System.out.println("최거점수를 받은 아이디: " + name);
    }
}
