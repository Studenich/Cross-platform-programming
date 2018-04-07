package sample;

/**
 * Class contains only 1 static method which takes text from the
 * one text field, reverse it and put it into another text field.
 *
 * @author Valentin Studenichnik
 */
final class ReverString {
    /**
     * Reversing method.
     *
     * @param input input String
     * @return output output String
     */
    public static String reverse(final String input) {
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Not called.
     */
    private ReverString() {
        //not called
    }
}
