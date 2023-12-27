import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class MagicalArenaTest {

    /**
    * Test to check if the MagicalArena game ends correctly when one of the players' health reaches 0.
    */
    @Test
    public void testMagicalArena() {
        Player playerA = new Player("Player A", 50, 10, 5);
        Player playerB = new Player("Player B", 100, 5, 10);

        // Create a new game
        MatchSimulator game = new MatchSimulator();

        // Start the game
        game.startMatch(playerA, playerB);

        assertTrue(playerA.getHealth() == 0 || playerB.getHealth() == 0);
    }

    /**
    * Test to check if the player takes damage correctly based on the damage received.
    */
    @Test
    public void testPlayerTakeDamage() {
        Player player = new Player("Player A", 50, 10, 5);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());

        player.takeDamage(40);
        assertEquals(0, player.getHealth());
    }

    /**
    * Test to check if the player's alive status is updated correctly after taking damage.
    */
    @Test
    public void testPlayerIsAlive() {
        Player player = new Player("Player A", 50, 10, 5);
        assertTrue(player.isAlive());

        player.takeDamage(50);
        assertFalse(player.isAlive());
    }
}
