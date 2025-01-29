public class Character {
    private int health;
    private int stamina;
    private int maxHp;
    private int maxSp;

    // Constructor
    public Character(int health, int stamina){
        this.health = health;
        this.maxHp = health;
        this.stamina = stamina;
        this.maxSp = stamina;
        System.out.println("Character created with " + maxHp + " health and " + maxSp + " stamina");
    }
    // Getter
    public int getHealth(){
        return health;
    }
    public int getStamina(){
        return stamina;
    }

    // Extras
    public boolean isAlive(){
        if(health > 0) return true;
        else{
            System.out.println("This character is already dead");
            return false;
        }
    }

    // Actions
    public void swingSword(){
        if(isAlive()){
            int strain = 50;
            if (stamina >= strain){
                stamina -= strain;
                if(stamina < 0) stamina = 0;
                System.out.println("Character swings sword. Stamina is now " + stamina);
            }
            if(stamina <= 0) System.out.println("Your character needs to cool down");
        }
    }
    public void takeDamage(int damage){
        if(isAlive()){
            health -= damage;
            if(health < 0) health = 0;
            System.out.println("Character takes " + damage + " damage. Health is now " + health);
            if (health <= 0){
                System.out.println("Character is dead");
            }
        }
    }
    public void rest(){
        if(isAlive()){
            health = maxHp;
            stamina = maxSp;
            System.out.println("Character has rested. Health and stamina restored to maximum");
        }
    }
}
