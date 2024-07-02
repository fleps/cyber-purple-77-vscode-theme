class CyberHacker:
  def __init__(self, props):
    self.location = props['location']
    self.birthDate = props['birthDate']
    self.deathDate = props['deathDate']
    self.techSkills = props['techSkills']

  def get_age(self):
    return self.calc_age()

  def calc_age(self):
    return self.deathDate - self.birthDate


CyberDude = CyberHacker({
  'location': 'Neo-Tokyo',
  'birthDate': 2050,
  'deathDate': 2080,
  'techSkills': ['Cyberdeck', 'Neuromods', 'Cyberware', 'Stealth', 'Agility', 'Enhancements'],
})
