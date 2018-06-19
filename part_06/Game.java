//package part_06;
//
//class Fighter{
//
//    // private variables
//    private String name;
//    private int health = 10;
//    private int attackPower = 1;
//
//
//    private String last_name;
//    private int level;
//
//    // name of fighter
//    public Fighter(String name) {
//        this.name = name;
//    }
//
//    // get/set name
//    public String getLast_name() {
//        return last_name;
//    }
//
//    public void setLast_name(String last_name) {
//        this.last_name = last_name;
//    }
//
//    // get/set level (Easy mode)
//    public int getLevel() {
//        return level;
//    }
//
//    public void setLevel(int level) {
//        this.level = level;
//    }
//
//    // heal method
//    public int heal(int addHeal) {
//        this.health += (addHeal);
//        return health;
//    }
//
//    // attack method
//    public int attack(int addAttackPower) {
//        this.attackPower += attackPower;
//        return attackPower;
//    }
//
//    // takes the hit method
//    public void decreaseHealth (int attackPower){
//        health -= attackPower;
//    }
//    @Override
//    public String toString() {
//        return "Fighter{" +
//                "name='" + name + '\'' +
//                ", health=" + health +
//                ", attackPower=" + attackPower +
//                '}';
//    }
//
//}
//// inherits Fighter class
//class Archer extends Fighter {
//
//    int arrows;
//
//Fighter max = new Fighter("Max");
//
//    public int
//
//
//}
//
//
//
//// inherits Fighter class
//class Monk extends Fighter {
//
//
//
//    }
//
//// inherits Monk > Fighter class
//class WarriorMonk extends Monk{
//
//    super(name){}
//    int healingBoost = 20;
//
//
//
//    }
//
//Fighter dee = new Fighter("Dee");
//Fighter ash = new Fighter("Ash");