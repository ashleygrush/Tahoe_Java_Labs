package part_07.DC_Universe;


public class Hero extends JusticeLeague {

    private String realName;


    public Hero(boolean superPowers, String heroName, boolean activeMember, String realName) {
        super(superPowers, heroName, activeMember);
        this.realName = realName;

    }
}
