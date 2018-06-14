package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/

class Control{
    public static void main(String[] args) {

        // set parameters
        Person Alex = new Person("Alex", 30, "male");
        Person Ashley = new Person("Ashley",30, "female");
        Person Max = new Person("Max",31, "male");


        Profile alexProfile = new Profile("blond", 6.0, "blue");
        Profile ashleyProfile = new Profile("brown", 5.4, "brown");
        Profile maxProfile = new Profile("blond", 5.11, "blue" );


        // call methods
        System.out.println(Alex.name + " is a " + Alex.getGender() + " with " +alexProfile.getEyeColor() + " color eyes.");
        System.out.println(Ashley.name+ " is a " + Ashley.getGender() + " and is " +ashleyProfile.getHeight()+ " feet tall.");
        System.out.println(Max.name+ " has " + maxProfile.getEyeColor() + " eyes and is " +maxProfile.getHeight()+ " feet tall.");
    }
}

class Person {

    // variables
    public String name;
    private int age;
    private String gender;


    // methods
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

class Profile {

    private String hair;
    private double height;
    private String eyeColor;


    public Profile(String hair, double height, String eyeColor) {
        this.hair = hair;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
}