public class Main {
    public static void main(String[] args){
      Character bob = new Character(80, 100);

      bob.swingSword();
      bob.swingSword();
      bob.swingSword();
      
      bob.takeDamage(50);

      System.out.println("Bob's health: " + bob.getHealth());
      System.out.println("Bob's stamina: " + bob.getStamina());
      bob.rest();
      System.out.println("Bob's health: " + bob.getHealth());
      System.out.println("Bob's stamina: " + bob.getStamina());
      
      bob.takeDamage(100);
      bob.swingSword();
      bob.takeDamage(10);
      bob.rest();
    }
}
