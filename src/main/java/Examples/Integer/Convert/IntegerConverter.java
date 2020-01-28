package Examples.Integer.Convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Integer 타입을 다른 타입으로 변경
 */
public class IntegerConverter {

    /**
     * int to {@link String}
     */
    public String intToString(int integer) {
        return Integer.toString(integer);
    }

    /**
     * {@link Integer} to {@link String}
     */
    public String integerToString(Integer integer) {
        return integer.toString();
    }

    /**
     * int[] to {@link String}
     */
    public String intArrToString(int[] intArr) {
        StringBuilder str = new StringBuilder();
        for (int integer : intArr) {
            str.append(integer);
        }
        return str.toString();
    }

    /**
     * {@link Integer}[] to {@link String}
     */
    public String integerArrToString(Integer[] intArr) {
        StringBuilder str = new StringBuilder();
        for (Integer integer : intArr) {
            str.append(integer);
        }
        return str.toString();
    }

    /**
     * int to char[]
     */
    public char[] intToCharArr(int number) {
        return ("" + number).toCharArray();
    }

    /**
     * {@link Integer} to char[]
     */
    public char[] integerToCharArr(Integer number) {
        return ("" + number).toCharArray();
    }

    /**
     * int to {@link List}
     */
    public List<Character> intToCharList(int integer) {
        char[] charArr = this.intToCharArr(integer);
        List<Character> characterList = new ArrayList<>();
        for (char c : charArr) {
            characterList.add(c);
        }
        return characterList;
    }

    /**
     * {@link Integer} to {@link List}
     */
    public List<Character> integerToCharList(Integer integer) {
        char[] charArr = this.intToCharArr(integer);
        List<Character> characterList = new ArrayList<>();
        for (char c : charArr) {
            characterList.add(c);
        }
        return characterList;
    }

}
