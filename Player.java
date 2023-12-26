import java.util.Random;

public class Player {

      private int health;

      private int attack;

      private int strength;

      public Player() {
      }

      public Player(int health, int attack, int strength) {
            this.health = health;
            this.attack = attack;
            this.strength = strength;
      }

      // Getter methods
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
      private int rollDie() {
            Random random = new Random();

            return random.nextInt(6) + 1;
      }

      
}