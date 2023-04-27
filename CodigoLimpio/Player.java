abstract class Player {
    String  type;
    int thoughnes;
    protected int damage;
    int getDamage(Player attacked) {
        return damage / attacked.thoughnes;
    }
}