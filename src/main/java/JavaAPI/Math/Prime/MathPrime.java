package JavaAPI.Math.Prime;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 소수 관련
 */
public class MathPrime {

    /**
     * 소수인지 체크 - BigInteger.isProbablePrime 사용
     */
    private boolean isPrime(int integer) {
        BigInteger bigInt = BigInteger.valueOf(integer);
        return bigInt.isProbablePrime(100);
    }

    /**
     * from <= integer <= to  소수의 갯수를 구함
     */
    public int getPrimeCountWithRange(int from, int to) {
        int count = 0;
        for (int i = from; i <= to; i++) {
            if (this.isPrime(i))
                count++;
        }
        return count;
    }

    /**
     * from <= integer <= to  소수의 배열을 반환
     */
    public Integer[] getPrimeArrWithRange(int from, int to) {

        List<Integer> primeList = new ArrayList<>();

        for (int i = from; i <= to; i++) {
            if (this.isPrime(i))
                primeList.add(i);
        }

        return primeList.toArray(new Integer[primeList.size()]);
    }

    /**
     * from <= integer <= to  소수의 List를 반환
     */
    public List<Integer> getPrimeListWithRange(int from, int to) {

        List<Integer> primeList = new ArrayList<>();

        for (int i = from; i <= to; i++) {
            if (this.isPrime(i))
                primeList.add(i);
        }

        return primeList;
    }
}