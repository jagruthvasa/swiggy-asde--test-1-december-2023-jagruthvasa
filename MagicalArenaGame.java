public class MagicalArenaGame {
      private Player playerA;
      private Player playerB;

      // Constructor to initialize players in the arena
      public MagicalArenaGame(Player playerA, Player playerB) {
            this.playerA = playerA;
            this.playerB = playerB;
      }

      // Method to start the match in the arena
      public void startMatch() {

            Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
            Player defender = (attacker == playerA) ? playerB : playerA;

            
      }

      

      public static void main(String[] args) {
            // Create players
            Player playerA = new Player("Player A", 50, 10, 5);
            Player playerB = new Player("Player B", 100, 5, 10);

            // Create a new game
            MagicalArenaGame game = new MagicalArenaGame(playerA, playerB);

            // Start the game
            game.startMatch();
      }
}