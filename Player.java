import java.util.Random;

public class Player {

      private String name; // New field to store the player's name

      private int health;

      private int attack;

      private int strength;

      public Player() {
      }

      public Player(String name, int health, int attack, int strength) {
            this.name = name;
            this.health = health;
            this.attack = attack;
            this.strength = strength;
      }

      // Getter methods
      public String getName() {
            return this.name;
      }

      public int getHealth() {
            return this.health;
      }

      public int getStrength() {
            return this.strength;
      }

      public int getAttack() {
            return this.attack;
      }

      // Simulate rolling a 6-sided die
      public int rollDie() {
            Random random = new Random();

            return random.nextInt(6) + 1;
      }

      // Method to apply damage to the player
      public void takeDamage(int damage) {
           this.health -= damage;
            if (this.health < 0) {
                  this.health = 0;
            }
      }

      // Check if the player is alive
      public boolean isAlive() {
            return this.health > 0;
      }
}