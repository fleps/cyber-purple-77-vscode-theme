public class CyberPunk2077
{
  public string Location { get; private set; }
  public int BirthDate { get; private set; }
  public int DeathDate { get; private set; }
  public string[] Weaknesses { get; private set; }

  public CyberPunk2077(string location, int birthDate, int deathDate, string[] weaknesses)
  {
    Location = location;
    BirthDate = birthDate;
    DeathDate = deathDate;
    Weaknesses = weaknesses;
  }

  public int Age()
  {
    return calcAge();
  }

  private int calcAge()
  {
    return DeathDate - BirthDate;
  }
}

class Program
{
  static void Main(string[] args)
  {
    // ...there was a cyberpunk named Nova

    var Nova = new CyberPunk2077(
      "Night City",
      2050,
      2077,
      new string[] { "Electricity", "Water" }
    );
  }
}
