#include <iostream>

using namespace std;
class Rectangle{
    private:
        int length;
        int width;
    public:
        void read_input(){
            cin >> length >> width;
        };
        int getLength(){
            return length;
        }
        int getWidth(){
            return width;
        }
        void display(){
            cout << length << " " << width << endl;
        }
};

class RectangleArea: public Rectangle
{
    private:
        int area;
    public:
        void display(){
            area = getLength() * getWidth();
            cout << area;
        };
};


int main()
{
    /*
     * Declare a RectangleArea object
     */
    RectangleArea r_area;
    
    /*
     * Read the width and height
     */
    r_area.read_input();
    
    /*
     * Print the width and height
     */
    r_area.Rectangle::display();
    
    /*
     * Print the area
     */
    r_area.display();
    
    return 0;
}