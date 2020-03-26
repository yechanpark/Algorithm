package JavaAPI.StreamAPI.caution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 스트림 재사용 문제
 */
public class StreamNonReusable implements StreamCaution {

    List<Integer> integerList;

    public StreamNonReusable() {
        this.integerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) integerList.add(i);
    }

    /**
     * 사용했던 스트림을 재사용
     * {@link IllegalStateException} 발생
     */
    @Override
    public void problem() {
        Stream<Integer> integerStream = integerList.stream();

        // 1회만 사용 가능
        integerStream.forEach(System.out::print);

        System.out.println();

        // 재사용 시 Exception 발생
        integerStream.forEach(System.out::print);
    }

    /**
     * 스트림을 재생성
     */
    @Override
    public void solution() {
        Stream<Integer> integerStream1 = integerList.stream();
        Stream<Integer> integerStream2 = integerList.stream();

        // 1회만 사용 가능
        integerStream1.forEach(System.out::print);

        System.out.println();

        // 1회만 사용 가능
        integerStream2.forEach(System.out::print);
    }
}
