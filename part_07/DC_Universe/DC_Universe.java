package part_07.DC_Universe;

public class DC_Universe {

    private String planet;
    private boolean human = true;
    private boolean superPowers = true;

     public DC_Universe(boolean superPowers) {
        this.superPowers = superPowers;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public boolean isHuman() {
        return human;
    }

    public void setHuman(boolean human) {
        this.human = human;
    }


    @Override
    public String toString() {
        return "DC_Universe{" +
                "planet='" + planet + '\'' +
                ", human=" + human +
                ", superPowers=" + superPowers +
                '}';
    }
}
