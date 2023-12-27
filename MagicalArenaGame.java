public class MagicalArenaGame {

      public static void main(String[] args) {
            // Create players
            Player playerA = new Player("Player A", 50, 10, 5);
            Player playerB = new Player("Player B", 100, 5, 10);

            // Create a new game
            MatchSimulator game = new MatchSimulator();

            // Start the game
            game.startMatch(playerA, playerB);
      }
}