# Box It!

Design a class named Box whose dimensions are integers and private to the class. The dimensions are labelled: length __*l*__, breadth __*b*__, and height __*h*__.  
The default constructor of the class should initialize
__*l*__, __*b*__, and __*h*__ to __0__.  

The parameterized constructor Box(int length, int breadth, int height) should initialize Box's __*l*__, __*b*__, and __*h*__ to length, breath and height.

The copy constructor Box(Box __*B*__) should set __*l*__, __*b*__, and __*h*__ to __*B*__'s __*l*__, __*b*__, and __*h*__, respectively.  

Apart from the above, the class should have __4__ functions:

- int getLength() - Return box's length
- int getBreadth() - Return box's breadth
- int getHeight() - Return box's height
- long long CalculateVolume() - Return the volume of the box

Overload the operator __<__ for the class Box. Box __*A*__ __<__ Box __*B*__ if:

1. __A.*l* < B.*l*__
2. __A.*b* < B.*b*__ and __A.*l* == B.*l*__
3. __A.*h* < B.*h*__ and __A.*b* == B.*b*__ and __A.*l* < B.*l*__

Overload operator __<<__ for the class Box().

If __B__is an object of class Box:

__*cout* << B__ should print __B.*l*__, __B.*b*__ and __B.*h*__ on a single line separated by spaces.

__Constraints__

> 0 (&lt;)

Two boxes being compared using the operator will not have all three dimensions equal.