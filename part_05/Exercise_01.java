package part_05;

import java.util.ArrayList;

/**
 * Write three classes.
 * The Class_01 should contain the main method.
 * The main method should create an instance of Class_02.
 *
 * Class_02 must have several private instance variables.
 * Use Class_01 to set the variables in Class_02.
 *
 * Within Class_02, create an instance of Class_03, which must also have several private variables.
 * Use Class_02 to set the private variables within Class_03.
 *
 * Please note, do not use the constructor of any of these classes to set the private instance variables.
 * Use System.out.println at various points to demonstrate the flow of execution and the varying state of each private variable.
 * You may name these classes whatever you like.
 */

class AnimalsControl {
    public static void main(String[] args) {
        Dog large = new Dog();
        Dog medium = new Dog();
        Dog small = new Dog();

     Dog australianShepherd = medium;
     Dog labrador = large;

     australianShepherd.profile.setName("Rocca");
     australianShepherd.setLocation("Australia");
     australianShepherd.setBreed("therapy");
     australianShepherd.setGender("female");
     australianShepherd.profile.setEyeColor("blue");
     australianShepherd.profile.setFurColor("mix");


     labrador.profile.setName("Remington");
     labrador.setLocation("Americas");
     labrador.setBreed("working");
     labrador.profile.setFurColor("black");
     labrador.profile.setEyeColor("amber");
     labrador.setGender("female");


        System.out.println("This first dog is named " +australianShepherd.profile.getName()+ " is a " +australianShepherd.getGender()+ ", "
                +australianShepherd.getBreed()+ " dog from a region in " + australianShepherd.getLocation()+ " .");
        System.out.println();
        System.out.println("This second dog is named " +labrador.profile.getName()+ " and has " +labrador.profile.getEyeColor()+
                " eyes and " +labrador.profile.getFurColor()+ " fur.");

    }
}

class Dog {
    // dog breed + sizes
    private String breed;
    private String gender;
    private String location;


    // getters and setters / returns and this
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    DogProfile profile = new DogProfile();


}


class DogProfile {

    // dog details
    private String furColor;
    private String eyeColor;
    private double weight;
    private String name;

    // getters and setters / returns and this
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


