package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */


// outer class (Park)
class Park {
    public static void main(String[] args) {

        Animals numOfDogs = new Animals();
        Animals numOfCats = new Animals();
        Animals aliveBirds = new Animals();

        // dog barks
        numOfDogs.setDogs(6);
        System.out.println(numOfDogs.dogBark());

        // number of cats
        System.out.println("There are " + numOfCats.countCats() + " cats at the park.");

        // number of birds
        System.out.println(aliveBirds.birds + " number of birds.");

        // number of total birds
        System.out.println("Since there are only " +numOfCats.cats+ " cats, there are now "
                +aliveBirds.countBird() + " total number of birds.");


    }

    // inner class (Animals)
    static class Animals {

        // variables
        int dogs;
        int cats = countCats();
        int birds = countBird();

        // get/set dogs
        public int getDogs() {
            return dogs;
        }

        public void setDogs(int dogs) {
            this.dogs = dogs;
        }

        // number of dog barks.
        public String dogBark() {
            if (dogs <= 8)
                System.out.println("Woof.");
            dogs++;
            if (dogs == 8) {
                return "The dog stops barking.";
            }
            return dogBark();
        }

        // count cats method
        public int countCats() {
            if (getDogs() < 2)
                cats = getDogs() + 2;
            if (getDogs()> 2)
                cats = getDogs() - 1;
            return cats;
        }

        // count birds
        public int countBird() {
            if (cats <= 2)
                birds = birds + 4;
            if (cats >= 2)
                birds = birds - 2;
            return birds;
        }

    }
}