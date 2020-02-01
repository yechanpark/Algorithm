package LeetCode.Easy.String.AddBinary;

/**
 *
 */
public class AddBinary_BestPractice {
    public String solution(String a, String b) {
        //Google immutability or string vs stringbuilder if you don't know why we use this instead of regular string
        StringBuilder sb = new StringBuilder();

        //two pointers starting from the back, just think of adding two regular ints from you add from back
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0) {
            //if there is a carry from the last addition, add it to carry
            int sum = carry;

            //we subtract '0' to get the int value of the char from the ascii
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';

            //if sum==2 or sum==0 append 0 cause 1+1=0 in this case as this is base 2 (just like 1+9 is 0 if adding ints in columns)
            sb.append(sum % 2);

            //if sum==2 we have a carry, else no carry 1/2 rounds down to 0 in integer arithematic
            carry = sum / 2;
        }

        //leftover carry, add it
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}