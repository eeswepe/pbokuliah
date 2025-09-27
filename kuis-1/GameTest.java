public class GameTest {
  public static void main(String[] args) {
    Player singgih = new Player("Singgih", 100, 20, 5);
    Monster goblin = new Monster("Goblin", 80, 15, "Goblin");
    BossMonster dragon = new BossMonster("Dragon", 200, 20);

    Character[] enemies = {goblin, dragon};

    System.out.println("=== Battle Start ===");

    int turn = 1;
    while (singgih.getHealth() > 0 && (goblin.getHealth() > 0 || dragon.getHealth() > 0)) {
      System.out.println("\n--- Turn " + turn + " ---");

      for (Character enemy : enemies) {
        if (enemy.getHealth() > 0) {
          singgih.attack(enemy);
          break; 
        }
      }

      for (Character enemy : enemies) {
        if (enemy.getHealth() > 0) {
          enemy.attack(singgih);
        }
      }

      if (turn % 3 == 0) {
        singgih.healing();
        System.out.println(singgih.getName() + " uses healing! Health: " + singgih.getHealth());
      }

      turn++;
    }

    System.out.println("\n=== Battle End ===");
    if (singgih.getHealth() <= 0) {
      System.out.println(singgih.getName() + " has been defeated...");
    } else {
      System.out.println(singgih.getName() + " wins the battle!");
    }
  }
}
