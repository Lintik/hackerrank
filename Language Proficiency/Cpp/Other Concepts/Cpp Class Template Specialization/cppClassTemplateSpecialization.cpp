#include <iostream>
using namespace std;
enum class Fruit { apple, orange, pear };
enum class Color { red, green, orange };

template <typename T> struct Traits;
template <typename T>
struct Traits
{
    private:
    static const int NAMES_LENGTH;
    static const string NAMES[];
    
    public:
    static string name(int index)
    {
        if (index < 0 || index >= NAMES_LENGTH)
            return "unknown";
        return NAMES[index];
    }
};
template <> const int Traits<Fruit>::NAMES_LENGTH = 3;
template <> const string Traits<Fruit>::NAMES[] = {"apple", "orange", "pear"};

template <> const int Traits<Color>::NAMES_LENGTH = 3;
template <> const string Traits<Color>::NAMES[] = {"red", "green", "orange"};

int main()
{
	int t = 0; std::cin >> t;

    for (int i=0; i!=t; ++i) {
        int index1; std::cin >> index1;
        int index2; std::cin >> index2;
        cout << Traits<Color>::name(index1) << " ";
        cout << Traits<Fruit>::name(index2) << "\n";
    }
}
