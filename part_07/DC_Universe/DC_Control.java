package part_07.DC_Universe;

public class DC_Control {
    public static void main(String[] args) {

        DC_Control dc = new DC_Control();

        Hero batman = new Hero(false, "Batman", true, "Bruce Wayne");
        Hero superman = new Hero(true,"Superman", true, "Kent Clark");
        Hero greenArrow = new Hero(false,"Green Arrow", true,"Oliver Queen");

//        Villan deathstroak = new Villan("Slade Wilson", "Deathstroak");



        System.out.println(dc.toString()+ " - there are active members in the Justice League.");


        System.out.println(superman.toString());
        System.out.println(greenArrow.toString());
    }
}
