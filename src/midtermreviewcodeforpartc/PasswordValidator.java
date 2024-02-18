/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author Rajmohinder kaur
 */
public class PasswordValidator {
     /**
     * Validates the provided password according to the current validation rules.
     *
     * @param password The password to validate.
     * @return true if the password meets all the validation rules, false otherwise.
     */
    public static boolean validate(String password) {
        return password.length() >= 8 &&
               containsSpecialCharacter(password) &&
               containsUpperCaseLetter(password) &&
               containsNumber(password);
    }

    /**
     * Checks if the password contains at least one special character.
     *
     * @param password The password to check.
     * @return true if the password contains a special character, false otherwise.
     */
    private static boolean containsSpecialCharacter(String password) {
        return password.matches(".*[^a-zA-Z0-9].*");
    }

    /**
     * Checks if the password contains at least one uppercase letter.
     *
     * @param password The password to check.
     * @return true if the password contains an uppercase letter, false otherwise.
     */
    private static boolean containsUpperCaseLetter(String password) {
        return password.matches(".*[A-Z].*");
    }

    /**
     * Checks if the password contains at least one number.
     *
     * @param password The password to check.
     * @return true if the password contains a number, false otherwise.
     */
    private static boolean containsNumber(String password) {
        return password.matches(".*[0-9].*");
    }


}
