public class Weapon {
    private String weapon;
    protected int damage;
    
    public Weapon(String weapon) {
        this.weapon = weapon;
        damage = 0;
    }
    
    public String getName() {
        return weapon;
    }
    
    public int getDamage() {
        return damage;
    }
}
