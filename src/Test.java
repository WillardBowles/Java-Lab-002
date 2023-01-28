/**
 *
 *
 * @author Trevor Hartman
 * @author Willard Bowles
 *
 * @since Version 1.0
 */
 class Test {

    public static void main(String[] args) {

        int Integer = 3;
        char M = 'M';
        String Empty = "%d%c";

        String CombinedString = String.format(Empty, Integer, M);

        String StringTemplate1 = "%s Tape is the best tape!";

        System.out.println(
            String.format(StringTemplate1, CombinedString));
    }
}
