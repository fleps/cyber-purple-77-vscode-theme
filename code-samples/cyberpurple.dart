class CyberHacker {
  String location;
  int birthDate, deathDate;
  List<String> weaknesses;

  CyberHacker({this.location, this.birthDate, this.deathDate, this.weaknesses});

  int get age => this.calcAge();

  int calcAge() => this.deathDate - this.birthDate;
}

void main() {
  // ...there was a guy named Neo
  final CyberSavvy = CyberHacker(
      location: 'New Tokyo',
      birthDate: 2040,
      deathDate: 2080,
      weaknesses: ['Sunlight', 'Neural inhibitors']);
}
