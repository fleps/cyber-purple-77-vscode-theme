/*
  In the glittering city of Neo-Tokyo...
*/
type CyberHacker struct {
  Location   string
  BirthDate  int
  DeathDate  int
  Weaknesses []string
}

func (c *CyberHacker) Age() int {
  return c.calcAge()
}

func (c *CyberHacker) calcAge() int {
  return c.DeathDate - c.BirthDate
}

func main() {
  hacker := &CyberHacker{
    Location:   "Neo-Tokyo",
    BirthDate:  1990,
    DeathDate:  2099,
    Weaknesses: []string{"Lack of sleep", "Too many hacking missions"},
  }

  fmt.Println(hacker.Age())
}
