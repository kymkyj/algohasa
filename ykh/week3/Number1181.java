package week3;

import java.util.*;
import java.util.stream.Collectors;

public class Number1181 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        ArrayList<HashMap<String, String>> hashMapList
                = new ArrayList<>();

        // 소문자의 문자열 입력
        for (int i = 0; i < input; i++) {
            HashMap<String, String> hashMap = new HashMap<>();

            String strInput =  sc.next();

            hashMap.put("str", strInput);
            hashMap.put("len", String.valueOf(strInput.length()));
            hashMapList.add(i, hashMap);
        }

        sc.close();

        //System.out.println(hashMapList);

        /*// 클래스를 별도로 생성하지 않고 파라미터에서 그대로 인스턴스 생성
        Collections.sort(hashMapList, new Comparator<HashMap<String, String >>() {
            @Override
            public int compare(HashMap<String, String> first, HashMap<String, String> second) {
                if(first.get("len").equals(second.get("len"))) {
                    return first.get("str").compareTo(second.get("str"));
                }

                return first.get("len").compareTo(second.get("len"));
            }
        });*/

        /*// 람다를 사용하여 Comparator 구현 (java 1.7 이후 버전부터 가능)
        Collections.sort(hashMapList, (first, second) -> {
                return first.get("len").compareTo(second.get("len"));
        });*/

        // 람다를 사용하여 Comparator 구현 (java 1.7 이후 버전부터 가능, 백준에서 채점 불가능)
        Collections.sort(hashMapList, (first, second) -> {
            if(first.get("len").equals(second.get("len"))) {                // 비교할 두 문자열의 길이가 같은경우
                return first.get("str").compareTo(second.get("str"));       // 두 문자열을 서로 비교하여 정렬
            }
            return first.get("len").compareTo(second.get("len"));           // 비교할 두 문자열의 길이가 다른 경우 -> 두 문자열의 길이를 서로 비교하여 정렬
        });

        System.out.println(hashMapList);


        /*List<HashMap<String, String>> resultList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < hashMapList.size(); i++) {
            if(!resultList.contains(hashMapList.get(i)))
                resultList.add(hashMapList.get(i));
        }*/

        // 리스트의 중복을 없앤 후 새로운 리스트에 반환, 스트림 역시 백준에서 채점 불가
        List<HashMap<String, String>> resultList = hashMapList.stream().distinct().collect(Collectors.toList());
        System.out.println(resultList);

        for (HashMap<String, String> hashMap : resultList) {
            System.out.println(hashMap.get("str"));
        }
    }
}