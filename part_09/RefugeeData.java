package part_09;

class RefugeeData {

    // variables for data

    // id number
    private int id;

    // Refugee year
    private int refYear;

    // Refugee Country
    private String refCountry;

    // Refugee Asylum
    private String refAsylum;

    // ref population
    private int refPopulation;

    // Refugee remaining
    private int refRemaining;

    public RefugeeData(int id, int refYear, String refCountry, String refAsylum, int refPopulation, int refRemaining) {
        this.id = id;
        this.refYear = refYear;
        this.refCountry = refCountry;
        this.refAsylum = refAsylum;
        this.refPopulation = refPopulation;
        this.refRemaining = refRemaining;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRefYear() {
        return refYear;
    }

    public void setRefYear(int refYear) {
        this.refYear = refYear;
    }

    public String getRefCountry() {
        return refCountry;
    }

    public void setRefCountry(String refCountry) {
        this.refCountry = refCountry;
    }

    public String getRefAsylum() {
        return refAsylum;
    }

    public void setRefAsylum(String refAsylum) {
        this.refAsylum = refAsylum;
    }

    public int getRefPopulation() {
        return refPopulation;
    }

    public void setRefPopulation(int refPopulation) {
        this.refPopulation = refPopulation;
    }

    public int getRefRemaining() {
        return refRemaining;
    }

    public void setRefRemaining(int refRemaining) {
        this.refRemaining = refRemaining;
    }

    @Override
    public String toString() {
        return "RefugeeData{" +
                "id=" + id +
                ", refYear=" + refYear +
                ", refCountry='" + refCountry + '\'' +
                ", refAsylum='" + refAsylum + '\'' +
                ", refPopulation=" + refPopulation +
                ", refRemaining=" + refRemaining +
                '}';
    }
}
