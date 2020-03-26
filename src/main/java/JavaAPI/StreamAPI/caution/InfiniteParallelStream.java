package JavaAPI.StreamAPI.caution;

import java.util.stream.IntStream;

/**
 * 무한 병렬 스트림 생성 문제
 */
public class InfiniteParallelStream implements StreamCaution {

    /**
     * 0부터 계속해서 출력
     */
    @Override
    public void problem() {
        IntStream.iterate(0, i -> i + 1).parallel().forEach(System.out::println);
    }

    /**
     * 0부터 10회 출력
     */
    @Override
    public void solution() {
        IntStream.iterate(0, i -> i + 1).parallel().limit(10).forEach(System.out::println);
    }
}
