public class Player {
    protected String name;
    protected int health;
    
    public Player(String playerName) {
        name = playerName;
        health = 100;
    }
    
    public String getName() {
        return name;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void sufferDamage(int damage) {
        health -= damage;
    }
    
    public void attack(Player opponent, Weapon weapon) {
        opponent.sufferDamage(weapon.damage);
    }
    
    public void drink(Potion potion) {
        health += potion.drink();
        if (health > 100) {
            health = 100;
        }
    }
}
