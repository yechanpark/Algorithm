package Examples.String.Convert;

import java.util.List;
import java.util.stream.Collectors;

/**
 * String 타입을 다른 타입으로 변경
 */
public class StringConverter {

    /**
     * String to int
     */
    public int toInt(String str) {
        return Integer.parseInt(str);
    }

    /**
     * String to char[]
     */
    public char[] toCharArr(String str) {
        return str.toCharArray();
    }

    /**
     * String to Character List
     */
    public List<Character> toCharList(String str) {
        return str
                .chars()                        // Convert to an IntStream
                .mapToObj(i -> (char) i)        // Convert int to char, which gets boxed to Character
                .collect(Collectors.toList());  // Collect in a List<Character>
    }


}