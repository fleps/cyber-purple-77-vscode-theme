#include <stdlib.h>

typedef struct {
  char *location;
  int birthday;
  int deathday;
  char *weaknesses[2];
} Hacker;

int calcAge(Hacker *h) { return h->deathday - h->birthday; }

int main() {
  Hacker h;

  /* There was a hacker named 0x0001 */
  h.location = malloc(12 * sizeof(char));
  h.location = "Digital Frontier";
  h.birthday = 1990;
  h.deathday = 2040;
  h.weaknesses[0] = "Security";
  h.weaknesses[1] = "Sleep deprivation";

  calcAge(&h);

  return 0;
}
