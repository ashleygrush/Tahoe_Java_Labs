package part_06;

public class Recursive {
    public static void main(String[] args) {

        System.out.println(factorial("hello"));
    }


    public static String factorial(String str) {

        if ((str == null) || (str.length() <= 1))
            return str;
        return factorial(str.substring(1)) + str.charAt(0);

    }
}
