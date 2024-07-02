class Hacker {
  private String location;
  private int birthDate;
  private int deathDate;
  private String[] weaknesses;

  public Hacker(String location, int birthDate, int deathDate, String[] weaknesses) {
    this.location = location;
    this.birthDate = birthDate;
    this.deathDate = deathDate;
    this.weaknesses = weaknesses;
  }

  public int getAge() {
    return this.calcAge();
  }

  public int calcAge() {
    return this.deathDate - this.birthDate;
  }
}

// ...there was a guy named Neo
public class cyberpunk {
  Hacker hacker = new Hacker(
      "Tokyo",
      1990,
      2090,
      new String[] { "Cops", "Government" });
}
