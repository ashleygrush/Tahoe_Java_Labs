package part_07.DC_Universe;

public class JusticeLeague extends DC_Universe {

    private String heroName;
    private boolean activeMember = true;

    public JusticeLeague(boolean superPowers, String heroName, boolean activeMember) {
        super(superPowers);
        this.heroName = heroName;
        this.activeMember = activeMember;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public boolean isActiveMember() {
        return activeMember;
    }

    public void setActiveMember(boolean activeMember) {
        this.activeMember = activeMember;
    }

    @Override
    public String toString() {
        return "JusticeLeague{" +
                "heroName='" + heroName + '\'' +
                ", activeMember=" + activeMember +
                '}';
    }
}
