public interface Playable {

      // Simulate rolling a 6-sided die
      public int rollDie();

      // Method to apply damage to the player
      public void takeDamage(int damage);

      // Check if the player is alive
      public boolean isAlive();
}