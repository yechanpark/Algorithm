package JavaAPI.Character.Validation;

public class AlphanumericCharacterValidation {

    /**
     * 영숫자 집합 ([A-Za-z0-9]) 검사
     */
    public boolean validateAlphanumericCharacter(char c) {
        return Character.isLetterOrDigit(c);
    }
}
