package part_12.LambChallenges;
// import Predicate class
// import function

public class LambControl {
    public static void main(String[] args) {
        // say good morning
        Speaking morningPortuguese = (name) -> "Bom dia, " +name+ "!" ;
        Speaking morningEnglish = (name) -> "Good morning, " +name+ "!";

        // say good night
        Speaking eveningPortuguese = (name) -> "Boa tarde, " +name+ "!";
        Speaking eveningEnglish = (name) -> "Good evening, " +name+ "!";





        // enter names to say good morning
        System.out.println(morningPortuguese.name("Ashley"));
        System.out.println(morningEnglish.name("Max"));

        // enter names to say good night
        System.out.println(eveningEnglish.name("Ashley"));
        System.out.println(eveningPortuguese.name("Max"));


    }

}
