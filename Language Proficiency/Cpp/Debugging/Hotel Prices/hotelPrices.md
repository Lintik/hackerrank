# Hotel Prices
In this challenge, the task is to debug the existing code to successfully execute all provided test files.

The given code defines two classes HotelRoom and HotelApartment denoting respectively a standard hotel room and a hotel apartment. An instance of any of these classes has two parameters: bedrooms and bathrooms denoting respectively the number of bedrooms and the number of bathrooms in the room.

The prices of a standard hotel room and hotel apartment are given as: 
+ Hotel Room: __*50 &times; bedrooms &plus; 100 &times; bathrooms*__.
+ Hotel Apartment: The price of a standard room with the same number bedrooms and bathrooms plus __100__. 

For example, if a standard room costs __200__, then an apartment with the same number of bedrooms and bathrooms costs __300__.

In hotel's codebase, there is a piece of code reading the list of rooms booked for today and calculates the total profit for the hotel. However, sometimes calculated profits are lower than they should be.

Debug the existing HotelRoom and HotelApartment classes' implementations so that the existing code computing the total profit returns a correct profit.

Your function will be tested against several cases by the locked template code.

__Input Format__

The input is read by the provided locked code template.  
In the first line, there is a single integer __*n*__ denoting the number of rooms booked for today.  
After that __*n*__ lines follow. Each of these lines begins with a room_type which is either standard or apartment, and is followed by the number of bedrooms and the number of bathrooms in this room.

__Constraints__
+ __1 &le; *n* &le; 100__ 
+ There is at least __1__ and at most __5__ bedrooms in a room 
+ There is at least __1__ and at most __5__ bathrooms in a room

__Sample Input 0__
```
2
standard 3 1
apartment 1 1
```
__Sample Output 0__
```
500
```

__Explanation 0__

In the sample we have one standard room with __3__ bedrooms and __1__ bathroom, and one apartment with one __1__ bedrooms and __1__ bathroom. The price for the room is __3  &times; 50 + 100 = 250__. The price for the apartment is __50 + 100 + 100 = 250__. Thus the hotel profit is __250 + 250 = 500__ as the sum of prices of both rooms.