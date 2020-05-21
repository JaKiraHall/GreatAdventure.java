public class Potion {
    private String potion;
    protected static int benefit;
    
    public Potion(String potion) {
        this.potion = potion;
        benefit = 10;
    }
    
    public String getName() {
        return potion;
    }
    
    public int getBenefit() {
        return benefit;
    }
    
    public int drink() {
        int level = benefit;
        benefit = 0;
        return level;
    }
}
