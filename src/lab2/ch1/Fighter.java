package lab2.ch1;

public class Fighter {
    private String name;
    private int damagePerAttack;
    private int health;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        System.out.println(this.getName() + " attacked " + opponent);
        opponent.health = opponent.health - this.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
