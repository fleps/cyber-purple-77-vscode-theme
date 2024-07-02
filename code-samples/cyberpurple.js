class Hacker {
  constructor(props) {
    this.location = props.location;
    this.birthDate = props.birthDate;
    this.deathDate = props.deathDate;
    this.techSkills = props.techSkills;
  }

  get yearsOfExperience() {
    return this.calcYearsOfExperience();
  }

  calcYearsOfExperience() {
    return this.deathDate - this.birthDate;
  }
}

const CyberJack = new Hacker({
  location: 'Neon City',
  birthDate: 2020,
  deathDate: 2050,
  techSkills: ['Blade Runner', 'Deus Ex', 'Cyberpunk 2077'],
});

const techHive = ['VR', 'AI', 'Cyberdeck', 'Neuromods', 'Cyberware', 'Stealth', 'Agility', 'Enhancements'];

techHive.forEach(tech => {
  console.log(`Welcome to the future, we got ${tech}!`);
});

// Fetch API
fetch('https://api.cyberpunk-rp.com/weapons')
  .then(response => response.json())
  .then(data => {
    console.log(`We got ${data.length} weapons!`);
  })
  .catch(error => {
    console.error(`Something went wrong: ${error}`);
  });

// For loop
for (let i = 0; i < 10; i++) {
  console.log(`Welcome to the Matrix, it's ${i}!`);
}

// Functions
function calculateDamage(damage, armor) {
  return damage - armor;
}

const hitPoints = calculateDamage(100, 30);
console.log(`Hit points remaining: ${hitPoints}`);
