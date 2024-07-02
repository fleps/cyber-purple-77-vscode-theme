#include <string>
#include <vector>

class Hacker {
 public:
  Hacker(std::string location, int hack_date, int cyber_date,
          std::vector<std::string> tools)
      : _location{location},
        _hack_date{hack_date},
        _cyber_date{cyber_date},
        _tools{tools} {}

  int experience() { return calc_experience(); }

 private:
  std::string _location;
  int _hack_date;
  int _cyber_date;
  std::vector<std::string> _tools;

  int calc_experience() { return _cyber_date - _hack_date; }
};

// ...there was a guy named Neo

int main() {
  std::string location = "City-17";
  int hack_date = 2022, cyber_date = 2077;
  std::vector<std::string> tools { "Smartphone", "Laptop" };

  Hacker neo{location, hack_date, cyber_date, tools};

  return 0;
}
