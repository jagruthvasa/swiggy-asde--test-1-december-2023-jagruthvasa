public class MatchSimulator {

      // Start a match between two players
      public void startMatch(Player playerA, Player playerB) {
            Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
            Player defender = (attacker == playerA) ? playerB : playerA;

            simulateAttack(attacker, defender);

            Player winner = (playerA.isAlive()) ? playerA : playerB;
            System.out.println(winner.getName() + " wins!");
      }

      // Simulate an attack between two players
      private void simulateAttack(Player attacker, Player defender) {
            if (!attacker.isAlive() || !defender.isAlive()) {
                  return;
            }

            // Roll the dice for both players
            int attackRoll = attacker.rollDie();
            int defendRoll = defender.rollDie();

            System.out.print(" attacked die value: " + attackRoll);
            System.out.print(" defend die value: " + defendRoll);

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
}
