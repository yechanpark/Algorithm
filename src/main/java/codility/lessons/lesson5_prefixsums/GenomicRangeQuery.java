package codility.lessons.lesson5_prefixsums;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * A DNA sequence can be represented as a string consisting of the letters A, C, G and T, which correspond to the types of successive nucleotides in the sequence. Each nucleotide has an impact factor, which is an integer. Nucleotides of types A, C, G and T have impact factors of 1, 2, 3 and 4, respectively. You are going to answer several queries of the form: What is the minimal impact factor of nucleotides contained in a particular part of the given DNA sequence?
 * <p>
 * The DNA sequence is given as a non-empty string S = S[0]S[1]...S[N-1] consisting of N characters. There are M queries, which are given in non-empty arrays P and Q, each consisting of M integers. The K-th query (0 ≤ K < M) requires you to find the minimal impact factor of nucleotides contained in the DNA sequence between positions P[K] and Q[K] (inclusive).
 * <p>
 * For example, consider string S = CAGCCTA and arrays P, Q such that:
 * <p>
 * P[0] = 2    Q[0] = 4
 * P[1] = 5    Q[1] = 5
 * P[2] = 0    Q[2] = 6
 * The answers to these M = 3 queries are as follows:
 * <p>
 * The part of the DNA between positions 2 and 4 contains nucleotides G and C (twice), whose impact factors are 3 and 2 respectively, so the answer is 2.
 * The part between positions 5 and 5 contains a single nucleotide T, whose impact factor is 4, so the answer is 4.
 * The part between positions 0 and 6 (the whole string) contains all nucleotides, in particular nucleotide A whose impact factor is 1, so the answer is 1.
 * Write a function:
 * <p>
 * class Solution { public int[] solution(String S, int[] P, int[] Q); }
 * <p>
 * that, given a non-empty string S consisting of N characters and two non-empty arrays P and Q consisting of M integers, returns an array consisting of M integers specifying the consecutive answers to all queries.
 * <p>
 * Result array should be returned as an array of integers.
 * <p>
 * For example, given the string S = CAGCCTA and arrays P, Q such that:
 * <p>
 * P[0] = 2    Q[0] = 4
 * P[1] = 5    Q[1] = 5
 * P[2] = 0    Q[2] = 6
 * the function should return the values [2, 4, 1], as explained above.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..100,000];
 * M is an integer within the range [1..50,000];
 * each element of arrays P, Q is an integer within the range [0..N − 1];
 * P[K] ≤ Q[K], where 0 ≤ K < M;
 * string S consists only of upper-case English letters A, C, G, T.
 */

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int M = P.length; // 쿼리 갯수
        int[] result = new int[M];

        // String to char[]
        char[] charArrayString = S.toCharArray();

        // char[] to int[]
        int[] intArray = new int[charArrayString.length];
        for (int i = 0; i < charArrayString.length; i++)
            intArray[i] = extract(charArrayString[i]);

        // 쿼리 갯수만큼 돌림
        for (int i = 0; i < M; i++) {
            int pIndex = P[i];
            int qIndex = Q[i];

            // 같은 인덱스인 경우 해당 인덱스 바로 리턴
            int tempSize = qIndex - pIndex + 1;
            if (tempSize == 1) {
                result[i] = intArray[qIndex];
                continue;
            }

            // 다른 인덱스인 경우
            int[] temp = new int[tempSize];

            // 해당 부분을 intArray에서 temp로 복사
            System.arraycopy(intArray, pIndex, temp, 0, tempSize);

            // 중복값 제거
            temp = IntStream.of(temp).distinct().toArray();

            // 오름차순 정렬
            Arrays.sort(temp);

            result[i] = temp[0];

        }

        return result;
    }

    private int extract(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
        }
        return 0;
    }
}
