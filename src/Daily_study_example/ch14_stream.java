package Daily_study_example;

import java.lang.reflect.Member;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ch14_stream {
    public static void main(String[] args) {

        // 두 데이터소스 생성
        String[] strArr = {"aaa", "bbb", "ccc" , "abc"};
        List<String> list = Arrays.asList(strArr);


        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(2);
        list2.add(5);



        // 스트림 생성
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = Arrays.stream(strArr);
        Stream<String> stream3 = Arrays.stream(strArr);

        // 파이프라인 연산 수행
        stream1.filter(str -> str.equals("aaa"))
                .forEach(i -> System.out.println("i = " + i));

        stream2.map(s -> s.toUpperCase())
                .forEach(i -> System.out.println(i));

        stream3.peek(n-> System.out.println("중간: " + n))
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println("결과: " + n));

        Stream<Integer> stream4 = list2.stream();
        int mul = stream4.reduce(1, (a, b) -> a * b);
        System.out.println("mul = " + mul);

        Stream<Integer> stream5 = list2.stream();
        ArrayList<Integer> arrayList = stream5.collect(Collectors.toCollection(ArrayList::new));
        arrayList.forEach(n -> System.out.println(n));

        // flatMap 메서드
        String[][] namesArray = new String[][]{
                {"A", "a"}, {"B", "b"},
                {"C", "c"}, {"D", "d"}
        };

        Arrays.stream(namesArray)
                .flatMap(innerArray -> Arrays.stream(innerArray))
                .forEach(n -> System.out.print(n));
    }
}
