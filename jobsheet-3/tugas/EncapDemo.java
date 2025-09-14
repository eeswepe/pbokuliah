public class EncapDemo {
  private String name;
  private int age;

  public String getName() {
    return this.name;
  }

  public void setName(String newName) {
    name = newName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int newAge) {
    if (age > 30) {
      age = 30;
    } else if (age < 18) {
      age = 18;
    } else {
      age = newAge;
    }
  }
}
