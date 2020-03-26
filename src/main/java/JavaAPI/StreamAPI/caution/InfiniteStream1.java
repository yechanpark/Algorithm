package JavaAPI.StreamAPI.caution;

import java.util.stream.IntStream;

/**
 * 무한 스트림 생성 문제
 */
public class InfiniteStream1 implements StreamCaution {

    /**
     * 0부터 계속해서 출력
     */
    @Override
    public void problem() {
        IntStream.iterate(0, i -> i + 1).forEach(System.out::println);
    }

    /**
     * 0부터 10회 출력
     */
    @Override
    public void solution() {
        IntStream.iterate(0, i -> i + 1).limit(10).forEach(System.out::println);
    }
}
