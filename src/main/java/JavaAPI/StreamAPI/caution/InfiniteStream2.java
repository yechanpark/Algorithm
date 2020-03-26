package JavaAPI.StreamAPI.caution;

import java.util.stream.IntStream;

/**
 * 무한 스트림 생성 문제
 */
public class InfiniteStream2 implements StreamCaution {

    /**
     * 0부터 계속해서 출력
     */
    @Override
    public void problem() {
        // 결과는 0, 1만
        IntStream.iterate(0, i -> (i + 1) % 2).peek(System.out::print).distinct().limit(10).forEach(System.out::println);

    }

    /**
     * 0부터 1까지만 구할 수 있도록 변경
     */
    @Override
    public void solution() {
        IntStream.iterate(0, i -> (i + 1) % 2).peek(System.out::print).distinct().limit(2).forEach(System.out::println);
    }
}
