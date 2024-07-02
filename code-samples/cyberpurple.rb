class CyberDude
  attr_reader :location, :birthDate, :deathDate, :weaknesses

  def initialize(opts)
    @location = opts[:location]
    @birthDate = opts[:birthDate]
    @deathDate = opts[:deathDate]
    @weaknesses = opts[:weaknesses]
  end

  def age
    calcAge
  end

  private

  def calcAge
    @deathDate - @birthDate
  end
end

cyberDude = CyberDude.new(
  location: 'Neo-Tokyo',
  birthDate: 2000,
  deathDate: 2100,
  weaknesses: %w[Sunlight Garlic],
)

puts cyberDude.age
