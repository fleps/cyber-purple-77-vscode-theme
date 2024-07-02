fn main() {
	let neo = Hacker::new(
		"Cyber City".to_string(),
		2020,
		2050,
		vec!["Cyberdeck".to_string(), "Hacking".to_string(), "Cyberpunk 2077".to_string()],
	);

	println!("{:?}", neo);
}

#[derive(Debug)]
struct Hacker {
	location: String,
	birth_date: u16,
	death_date: u16,
	tech_skills: Vec<String>,
}

impl Hacker {
	pub fn new(
		location: String,
		birth_date: u16,
		death_date: u16,
		tech_skills: Vec<String>,
	) -> Self {
		Hacker {
			location,
			birth_date,
			death_date,
			tech_skills,
		}
	}

	pub fn age(&self) -> u16 {
		self.calc_age()
	}

	fn calc_age(&self) -> u16 {
		self.death_date - self.birth_date
	}
}
