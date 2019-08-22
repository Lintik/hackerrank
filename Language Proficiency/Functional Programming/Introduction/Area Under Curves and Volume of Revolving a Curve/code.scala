// This function will be used while invoking "Summation" to compute
// The area under the curve.
def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
{
//Fill Up this function body
// To compute the value of the function
// For the given coefficients, powers and value of x
<<<<<<< HEAD
=======
    coefficients.zip(powers)
    .foldLeft(0.0){case (acc,(c,p))=> acc + c * math.pow(x,p)}
>>>>>>> 9e8de5d703d9e69846127a663b3f7fd740bd5559
}

// This function will be used while invoking "Summation" to compute 
// The Volume of revolution of the curve around the X-Axis
// The 'Area' referred to here is the area of the circle obtained
// By rotating the point on the curve (x,f(x)) around the X-Axis
def area(coefficients:List[Int],powers:List[Int],x:Double):Double = 
{
//Fill Up this function body
// To compute the area of the circle on revolving the point
// (x,f(x)) around the X-Axis
// For the given coefficients, powers and value of x
<<<<<<< HEAD
}

// This is the part where the series is summed up
// This function is invoked once with func = f to compute the area 	     // under the curve
=======
    math.Pi * math.pow(f(coefficients,powers,x),2)
}

// This is the part where the series is summed up
// This function is invoked once with func = f to compute the area          // under the curve
>>>>>>> 9e8de5d703d9e69846127a663b3f7fd740bd5559
// Then it is invoked again with func = area to compute the volume 
// of revolution of the curve
def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double =
{
// Fill up this function
<<<<<<< HEAD
}


=======
    val step = 0.001
    val subIntervals= lowerLimit.toDouble to upperLimit by step
    subIntervals
    .foldLeft(0.0){case (acc,x)=> acc + func(coefficients,powers,x)*step}
}
>>>>>>> 9e8de5d703d9e69846127a663b3f7fd740bd5559
// The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.