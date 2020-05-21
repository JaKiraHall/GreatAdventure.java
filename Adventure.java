public class Adventure {
    public static void main(String[] args) {
        Player frodo = new Player("Frodo");
        Player sauron = new Player("Sauron");
        
        Potion elixir = new MagicElixir();
        Weapon sting = new Sword();
        Weapon blaster = new Blaster();
        
        sauron.attack(frodo, blaster);
        frodo.attack(sauron, sting);
        sauron.attack(frodo, blaster);
        
        frodo.drink(elixir);
    
        System.out.println("Frodo's health: " + frodo.getHealth());
        System.out.println("Sauron's health: " + sauron.getHealth());
    }
}
