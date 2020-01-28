package Examples.Character.Convert;

public class CharacterConverter {

    /**
     * char to {@link String}
     */
    public String charToString(char c) {
        return ((Character) c).toString();
    }

    /**
     * {@link Character} to {@link String}
     */
    public String characterToString(Character c) {
        return c.toString();
    }

    /**
     * char[] to {@link String}
     */
    public String charArrToString(char[] charArr) {
        StringBuilder str = new StringBuilder("");
        for (char c : charArr) {
            str.append(c);
        }
        return str.toString();
    }

    /**
     * {@link Character}[] to {@link String}
     */
    public String characterArrToString(Character[] charArr) {
        StringBuilder str = new StringBuilder("");
        for (char c : charArr) {
            str.append(c);
        }
        return str.toString();
    }

    /**
     * char to int
     */
    public int charToInt(char c) {
        return Character.getNumericValue(c);
    }

    /**
     * char to {@link Integer}
     */
    public Integer charToInteger(char c) {
        return Character.getNumericValue(c);
    }
}
