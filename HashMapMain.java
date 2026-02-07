package test.ex1;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        String[] soldItems = {"notebook", "mouse", "keyboard", "notebook", "mouse", "notebook", "monitor", "mouse", "mouse"};

        String bestSeller = solution(soldItems);
        System.out.println("가장 많이 팔린 물건 : " + bestSeller);
    }

    private static String solution(String[] items) {
        Map<String , Integer> map = new HashMap<>();

        for(String item : items) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        int maxCount = 0;
        String  bestSeller = null;
        for (String key : map.keySet()) {
            int count = map.get(key); // 해당 물건의 판매 개수

            if (count > maxCount) {
                maxCount = count;
                bestSeller = key;
            }
        }

        return bestSeller;
    }
}
