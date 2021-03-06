package LeetCode.Easy.Math.FactorialTrailingZeros;

/**
 * 공식키워드 - Math
 * <p>
 * If we knew how many times we could divide n! by 10 without causing it to no longer be an integer, we would have our answer.
 * For example, if n! equaled 3628800, we could divide it by 10 twice and the result would still be an integer.
 * This is because there are two trailing zeroes.
 * The number of times we can divide an integer by 10 before it is no longer an integer can be referred to as the number of factors of 10 in the integer.
 * <p>
 * 10's prime factors are 5 and 2.
 * No two other prime numbers multiply to equal 10 (if you don't believe this, try now to find two other prime numbers that multiply to equal 10).
 * The above means that for every factor of 10 that can be found in a number, there is exactly one factor of 5 and one factor of 2.
 * In other words, one factor of 5 and one factor of 2 in an integer mean the integer has one factor of 10.
 * And the number of factors of 10 in n! is the answer we're looking for.
 * <p>
 * So, if we can figure out the lesser of how many 5s and how many 2s are hiding within the sequence of numbers being multiplied together in the calculation for n!,
 * we will know how many 10s are hiding there.
 * and we will have our answer (see above if you don't understand why).
 * <p>
 * Every other number (i.e. every even number) in the calculation for n! will have at least one factor of 2, so the number of factors of 2 will far exceed the number of factors of 5.
 * Because we're looking for the lesser of the two, we can just focus on finding the number of factors of 5.
 * <p>
 * All multiples of 5 have at least one factor of 5.
 * Powers of 5, as in 5^2 or 5^3, have more than one factor of 5, so those needs to be counted more than once.
 * More on that later.
 * <p>
 * The equation for calculating the number of multiples of 5 within n! is n / 5.
 * For example, 10! = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10.
 * Did you spot the multiples of 5? They are 5 and 10, so there are two multiples of 5 in 10!.
 * There are 10 total numbers being multiplied together in 10! and we encounter a multiple of 5 every 5 numbers.
 * So, in 10 numbers, we encounter 2 multiples of 5.
 * <p>
 * So, for every multiple of 5 in n!, we know we have a factor of 5 (which means we have a factor of 10 and the number of factors of 10 is the number of zeroes at the end of n!). So, using a variable to store the count of factors of 5, we can use the equation above and add n / 5 to our count.
 * <p>
 * But we're not done yet.
 * We need to be sure to count the additional 5s hiding in numbers like 25, 625, 5^4, 5^5, etc.
 * These numbers are multiples of 5, so they've already been counted once, but they contain additional factors of 5 that need to be counted again.
 * 25 has one more factor of 5. 625 has two more. 5^4 has three more, etc.
 * <p>
 * To handle the additional factors of 5 the multiples of 25 contribute, we can just add the number of multiples of 25 to our count.
 * They were already counted once when we added the number of multiples of 5 to our count.
 * That took care of their first factor of 5.
 * Counting them once again takes cares of their second factor of 5.
 * To do this, we can use the equation for calculating the number of multiples of a number in n! again, adding n / 25 to our count.
 * <p>
 * The same needs to be done for multiples of 625. They have a total of three factors of 5. The first was counted when we counted the number of multiples of 5. The second was counted when we counted the number of multiples of 25 (multiples of 625 are also multiples of 25). We can count the third by counting the number of multiples of 625. So, count += n / 625.
 * <p>
 * We can stop counting when we reach the point where we're not getting back any multiples.
 * For example, 10! doesn't have any multiples of 25, much less 625.
 * So, we can stop counting once our calculation for the number of multiples returns 0 (i.e. the denominator is so large that the calculation results in a number less than 1).
 * <p>
 * The way to grow the denominator from 5 to 25 to 625 and on is to just keep dividing by 5.
 * After all, n / 25 = (n / 5) / 5. And the local count of the multiples for the current power of 5 can be elegantly reused in our algorithm as the value which we divide by 5 again to calculate the number of multiples of the next power of 5.
 */
public class FactorialTrailingZeros_BestPractice {
    public int solution(int n) {
        int count = 0;
        int tmp;
        while (n != 0) {
            tmp = n / 5;
            count += tmp;
            n = tmp;
        }
        return count;
    }
}