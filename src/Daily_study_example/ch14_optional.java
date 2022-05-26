package Daily_study_example;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ch14_optional {
    public static void main(String[] args) throws InterruptedException {
        // Optional 생성
        // null 가능성 있을 경우 ofNullable , 없을 경우 of
        Optional<String> opt1 = Optional.ofNullable(null);
        Optional<String> opt2 = Optional.of("abc");

        // null인지 아닌지 리턴
        System.out.println(opt1.isPresent());
        System.out.println(opt2.isPresent());

        // optional에 저장된 값 가져오기. null일 경우 디폴트값 지정 가능
        System.out.println(opt1.orElse("null 입니다"));
        System.out.println(opt2.get());

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(list);
        // 중간연산까지만 진행하고 최종연산을 하지 않으면 작업시 시작되지 않는다.
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).filter(n -> n > 2);

        System.out.println("# not processed stream");
        Thread.sleep(5000L);
        System.out.println("# invoke terminal operation");
        stream.forEach(System.out::println);
    }

}
