package Examples.String.Sequence;

/**
 * String을 역순으로 출력
 */
public class StringBufferReverse {
    public String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
