package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */

class VarargsClass {
    public static void main(String[] args) {

        stringBuilder("So ", "close ", "no ", "matter ", "how ", "far,");
        stringBuilder("Couldn't ", "be ", "much ", "more ", "from ", "the ", "heart.");
        stringBuilder("Forever ", "trust ", "in ", "who ", "we ", "are,");
        stringBuilder("And ", "nothing ", "else ", "matters.");
        stringBuilder();
        stringBuilder("Metallica ", " - ", "Nothing ", "Else ", "Matters.");

    }

    static void stringBuilder(String... line) {

        System.out.println();

        for (String l : line) {
            System.out.print(l);
        }

    }
}


