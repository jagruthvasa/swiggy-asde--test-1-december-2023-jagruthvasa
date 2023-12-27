<a name="readme-top"></a>

<!-- ABOUT THE PROJECT -->
# Magical Arena Design

## Problem Statement

Design a Magical Arena where players engage in battles. Each player is characterized by three attributes: `health`, `strength`, and `attack` — all positive integers. A player is defeated if their health drops to 0. Players take turns attacking, and the outcome is determined by rolling dice.

- **Attack Mechanism:**
  - Attacking player rolls an attacking dice.
  - Defending player rolls a defending dice.
  - The attacker's damage is calculated by multiplying the attack value with the attacking dice outcome.
  - The defender's defense is calculated by multiplying the strength value with the defending dice outcome.
  - Excess damage over the defense reduces the defender's health.

- **Game Rules:**
  - The game continues until one player's health reaches 0.
  - The player with lower health attacks first at the start of a match.

## Example Scenario

Consider two players, Player A and Player B:

- **Player A:**
  - Health: 50
  - Strength: 5
  - Attack: 10

- **Player B:**
  - Health: 100
  - Strength: 10
  - Attack: 5

- **Dice Information:**
  - Attacking and defending dice are 6-sided with values ranging from 1 to 6.

- **Match Execution:**
  - Player A attacks, rolls a die (result: 5).
  - Player B defends, rolls a die (result: 2).
  - Attack damage: 5 * 10 = 50; Defending strength: 10 * 2 = 20.
  - Player B's health reduced by 30 to 70.

  - Player B attacks, rolls a die (result: 4).
  - Player A defends, rolls a die (result: 3).
  - Attack damage: 4 * 5 = 20; Defending strength: 5 * 3 = 15.
  - Player A's health reduced by 5 to 45.

  - The game continues in this manner.

## Game Flow

Players take turns attacking and defending until one player's health reaches 0. The player with the lower initial health attacks first.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


### Built With

* [![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=java&logoColor=white)](https://www.java.com/)
* [![JUnit](https://img.shields.io/badge/JUnit-25A162?style=flat&logo=junit5&logoColor=white)](https://junit.org/junit5/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- GETTING STARTED -->
## Getting Started

### Prerequisites and Installation

* Before you begin, ensure you have Java installed on your machine. If not, follow the steps in the [Setting up the Environment for Java](https://www.geeksforgeeks.org/setting-environment-java/) guide on GeeksforGeeks.
* Make Sure to install junit. If Not, follow the steps in the [Setting up the Environment for JUnit](https://www.tutorialspoint.com/junit/junit_environment_setup.htm)) guide on Tutorials Point.

### Get Code

1. Clone the MagicalArena repository:

   ```bash
   git clone https://github.com/jagruthvasa/swiggy-asde--test-1-december-2023-jagruthvasa.git

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- USAGE EXAMPLES -->
## Executing the Code

1. **Adjust Player Values:**
   - Open the `MagicalArenaGame` class file.
   - Locate the `main` method, where players `playerA` and `playerB` are created.
   - Customize the player values by modifying the arguments passed to the `Player` constructor.

     ```java
     // Example:
     Player playerA = new Player("Player A", 60, 8, 7);
     Player playerB = new Player("Player B", 80, 6, 12);
     ```

   Adjust the health, attack, and strength values according to your preference.

2. **Compile the Code:**
   - Open a terminal or command prompt.
   - Navigate to the directory containing the `MagicalArenaGame` and `Player` classes.
   - Compile the Java files using the following command:

     ```bash
     javac MagicalArenaGame.java
     ```

   Ensure that you have Java installed, as mentioned in the prerequisites.

3. **Run the Program:**
   - After a successful compilation, run the program with the following command:

     ```bash
     java MagicalArenaGame
     ```

   This will start the MagicalArena game with the adjusted player values.

4. **View the Output:**
   - The game will simulate a match between the two players, and the output will be displayed in the console.
   - The output includes details of each attack, damage dealt, and the final winner of the match.

**Note:** Ensure that you have the `MatchSimulator` and other related classes available in the same directory or adjust the compile command accordingly if the classes are in different directories.



<!-- ROADMAP -->
## Achieved

- [x] **Simple Design:** The implementation prioritizes simplicity by adopting a clean and clear structure. The code follows a logical flow, ensuring that the core mechanics of the Magical Arena game are easily comprehensible.

- [x] **Readability:** To enhance readability, the code employs consistent and meaningful naming conventions along with well-organized and appropriately indented code blocks.

- [x] **Modeling:** The design of the Magical Arena is implemented using well-defined classes and objects. The `Player` class encapsulates the attributes and actions of a player, serving as a robust representation of a player's state within the game. This modeling approach establishes a clear and coherent structure.

- [x] **Maintainability:** In terms of maintainability, an interface has been introduced, offering flexibility for potential alternative implementations or future extensions. The modular organization of the code, with distinct classes for `Player`, `MatchSimulator`, and the main game logic in `MagicalArenaGame`, minimizes the impact of future changes on existing code. This design choice ensures that the codebase remains adaptable and easy to maintain.

- [x] **Testability:** The implementation prioritizes testability through the incorporation of comprehensive unit tests using JUnit. These tests cover various aspects of the game, including overall match outcomes, player health updates, and the alive status of players.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

## Video Demo



https://github.com/jagruthvasa/swiggy-asde--test-1-december-2023-jagruthvasa/assets/60261491/e294d1e5-2cea-43e2-bf48-487b76bd9ced



<!-- CONTACT -->
## Contact

Vasa Sai Jagruth - [Git Repo](https://github.com/jagruthvasa/swiggy-asde--test-1-december-2023-jagruthvasa/) -  [LinkedIn](https://www.linkedin.com/in/jagruth/) - jagruthvasa@gmail.com - 9010545613

<p align="right">(<a href="#readme-top">back to top</a>)</p>
