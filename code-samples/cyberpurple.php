<?php
/*
 * Once upon a time in Neon City...
 */
class CyberDecker {
  public string $location;
  public int $birthDate;
  public int $deathDate;
  public array $weaknesses;

  public function __construct(array $props) {
    $this->location = $props['location'];
    $this->birthDate = $props['birthDate'];
    $this->deathDate = $props['deathDate'];
    $this->weaknesses = $props['weaknesses'];
  }

  public function yearsOfExperience(): int {
    return $this->calcYearsOfExperience();
  }

  private function calcYearsOfExperience(): int {
    return $this->deathDate - $this->birthDate;
  }
}

// ...there was a guy named Jack
$Jack = new CyberDecker([
  'location' => 'Neon City',
  'birthDate' => 2020,
  'deathDate' => 2050,
  'weaknesses' => ['Fallout', 'Bullet', 'Traps']
]);
?>



