package part_06;


// controller
class AlcoholControl {
    public static void main(String[] args) {

        // variables
        Tequila patron = new Tequila("Patron", 40, 3.5, true, "Silver");

        Whiskey jameson = new Whiskey("Jameson", 40, 3.5, "Ireland", true);
        Whiskey bushmills = new Whiskey("Bushmills", 40, 3.5, "Ireland", true);

        HardLiquor rum = new HardLiquor("Rum",45,3.5);

        HardLiquor gin = new HardLiquor("Gin", 60, 3.5);

        gin.location();
        bushmills.location();

        System.out.println(rum.toString());





    }
}

// Hard liquor
class HardLiquor {
    private String name;
    private int alcPercentage;
    private double bottleSize;

    public HardLiquor(String name, int alcPercentage, double bottleSize) {
        this.name = name;
        this.alcPercentage = alcPercentage;
        this.bottleSize = bottleSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlcPercentage() {
        return alcPercentage;
    }

    public void setAlcPercentage(int alcPercentage) {
        this.alcPercentage = alcPercentage;
    }

    public double getBottleSize() {
        return bottleSize;
    }

    public void setBottleSize(double bottleSize) {
        this.bottleSize = bottleSize;
    }

    public String location(){
        System.out.println(getName() + " is located in the USA.");
        return getName();
    }

    @Override
    public String toString() {
        return "HardLiquor{" +
                "name='" + name + '\'' +
                ", alcPercentage=" + alcPercentage +
                ", bottleSize=" + bottleSize +
                '}';
    }
}

// extends Hard liquor
class Tequila extends HardLiquor {
    private boolean agave = true;
    private String color;

    public Tequila(String name, int alcPercentage, double bottleSize, boolean agave, String color) {
        super(name, alcPercentage, bottleSize);
        this.agave = agave;
        this.color = color;
    }

    public boolean isAgave() {
        return agave;
    }

    public void setAgave(boolean agave) {
        this.agave = agave;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tequila{" +
                "agave=" + agave +
                ", color='" + color + '\'' +
                '}';
    }
}


// entends Hard Liquor
class Whiskey extends HardLiquor {
    private String location;
    private boolean wheat = true;

    public Whiskey(String name, int alcPercentage, double bottleSize, String location, boolean wheat) {
        super(name, alcPercentage, bottleSize);
        this.location = location;
        this.wheat = wheat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isWheat() {
        return wheat;
    }

    public void setWheat(boolean wheat) {
        this.wheat = wheat;
    }

    public String location(){
        super.location();
        System.out.println(getName()+ " is located in Europe.");
        return getName();
    }


    @Override
    public String toString() {
        return "Whiskey{" +
                "location='" + location + '\'' +
                ", wheat=" + wheat +
                '}';
    }
}

