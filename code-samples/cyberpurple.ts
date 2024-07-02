interface HackerProps {
  location: string;
  birthDate: number;
  deathDate: number;
  techSkills: string[];
}

class Hacker {
  location: string;
  birthDate: number;
  deathDate: number;
  techSkills: string[];

  constructor(props: HackerProps) {
    this.location = props.location;
    this.birthDate = props.birthDate;
    this.deathDate = props.deathDate;
    this.techSkills = props.techSkills;
  }

  get yearsOfExperience(): number {
    return this.calcYearsOfExperience();
  }

  calcYearsOfExperience(): number {
    return this.deathDate - this.birthDate;
  }
}

const CyberDude: HackerProps = new Hacker({
  location: 'Neo-Tokyo',
  birthDate: 2000,
  deathDate: 2100,
  techSkills: ['JavaScript', 'React', 'Cyberpunk 2077'],
});

// Example of a function using some of the new features of TypeScript
function fancyMath(a: number, b: number): number {
  const result = a ** b;
  const result2 = a ** 0.5;
  const result3 = a ** -1;
  const result4 = Math.log(a);
  return result + result2 + result3 + result4;
}

// Example of an async function
async function fetchData(url: string): Promise<string> {
  const response = await fetch(url);
  const data = await response.text();
  return data;
}

// Example of a class with private and readonly properties
class MyPerson {
  private readonly name: string;
  private age: number;
  constructor(name: string, age: number) {
    this.name = name;
    this.age = age;
  }
  getAge(): number {
    return this.age;
  }
}
