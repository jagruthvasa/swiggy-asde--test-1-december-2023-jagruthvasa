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

            simulateAttack(attacker, defender);

            Player winner = (playerA.isAlive()) ? playerA : playerB;
            System.out.println(winner.getName() + " wins!");
      }

      public void simulateAttack(Player attacker, Player defender) {

            if (!attacker.isAlive() || !defender.isAlive()) {
                  return;
            }

            // Roll the dice for both players
            int attackRoll = attacker.rollDie();
            int defendRoll = defender.rollDie();

            System.out.print("attackRoll: " + attackRoll);
            System.out.print(" defendRoll: " + defendRoll);

            // Calculate damage and defense
            int damage = attackRoll * attacker.getAttack();
            int defense = defendRoll * defender.getStrength();

            System.out.print(" damage: " + damage);
            System.out.print(" defense: " + defense);

            // Calculate the damage dealt to the defender
            int damageDealt = Math.max(0, damage - defense);

            System.out.print(" damageDealt: " + damageDealt + " ");

            defender.takeDamage(damageDealt);

            // Print the match details
            System.out.println(attacker.getName() + " attacks " +
                        defender.getName() + " with damage: " + damageDealt +
                        ". " + defender.getName() + " health: " + defender.getHealth());

            simulateAttack(defender, attacker);
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