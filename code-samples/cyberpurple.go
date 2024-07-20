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

package main

import (
	"fmt"
	"math/rand"
	"time"
)

// Struct representing a person
type Person struct {
	Name string
	Age  int
}

// Function to greet a person
func greet(name string) {
	fmt.Println("Hello,", name)
}

// Function to calculate the average of a slice of integers
func average(numbers []int) float64 {
	sum := 0
	for _, number := range numbers {
		sum += number
	}
	return float64(sum) / float64(len(numbers))
}

// Function to generate a random string
func generateRandomString(length int) string {
	rand.Seed(time.Now().UnixNano())
	const charset = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
	var sb []byte
	for i := 0; i < length; i++ {
		sb = append(sb, charset[rand.Intn(len(charset))])
	}
	return string(sb)
}

// Main function
func main() {
	// Greeting example
	greet("John Doe")

	// Person struct example
	person := Person{"Jane Doe", 30}
	fmt.Println(person.Name, person.Age)

	// Average calculation example
	numbers := []int{1, 2, 3, 4, 5}
	avg := average(numbers)
	fmt.Println("Average:", avg)

	// Random string generation example
	randomString := generateRandomString(10)
	fmt.Println("Random string:", randomString)

	// Using a for loop
	for i := 0; i < 5; i++ {
		fmt.Println("Iteration:", i)
	}

	// Using a switch statement
	day := "Monday"
	switch day {
	case "Monday":
		fmt.Println("Start of the week")
	case "Friday":
		fmt.Println("End of the week")
	default:
		fmt.Println("Just another day")
	}
}