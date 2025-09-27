public class BossMonster extends Character {
  public BossMonster(String name, int health, int attackPower) {
    super(name, health, attackPower);
  }

  @Override
  public void attack(Character target) {
    int damage = (int) (getAttackPower() * 2);
    System.out.println(getName() + " ( Boss Monster ) attacks ferociously! Damage: " + damage);
    target.takeDamage(damage);
  }
}
