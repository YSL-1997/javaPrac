##Definition##

1. **Instance Variables** (**Non-Static** Fields): a field declared without the 
static modifier. Non-static fields are also known as instance variables because 
their values are unique to each instance of a class (to each object, in other words); 
- e.g. currentSpeed of one bicycle is independent from the currentSpeed of another.

2. **Class Variables** (**Static** Fields): a field declared with the static modifier; 
this tells the compiler that there is exactly one copy of this variable in 
existence, regardless of how many times the class has been instantiated. 
- e.g. A field defining the number of gears for a particular kind of bicycle 
could be marked as **static** since conceptually the same number of gears will 
apply to all instances. The code ```static int numGears = 6;``` would create such 
a static field. Additionally, the keyword ```final``` could be added to indicate 
that the number of gears will never change.

3. **Local Variables**: a method will often store its temporary state in local 
variables. The syntax for declaring a local variable is e.g. ```int count = 0;```. 
There is no special keyword designating a variable as local; that determination 
comes entirely from the location in which the variable is declared — inside a method.
Hence, local variables are only visible to the methods in which they are declared; 
they are not accessible from the rest of the class.

4. **Parameters**: parameters are always classified as "variables" not "fields". 
This applies to other parameter-accepting constructs as well (such as constructors 
and exception handlers)

##Naming##
Convention: for constant variables - ```static final int NUM_GEARS = 6;```

##Primitive Data Types (7 in total)##
- byte: 8-bit, 1 byte, -128~127
- short: 16-bit, 2 bytes, -32,768~32,767
- int: 32-bit, 4 bytes, -2^31~2^31-1
- long: 64-bit, 8 bytes, -2^63~2^63-1
```compareUnsigned```, ```divideUnsigned``` etc are in Integer class and Long 
class to support the arithmetic operations for unsigned integers.

- float: 32-bit, 4 bytes
- double, 64-bit, 8 bytes
Never use these for precise values (currency). Use java.math.BigDecimal class instead.

- boolean, 1-bit
- char, 16-bit, 2 bytes, '\u0000' (or 0) ~ '\uffff' (or 65,535)

Default values are **0** or **NULL** or **false**.

Local variables are slightly different; the compiler never assigns a default value to an uninitialized local variable. If you cannot initialize your local variable where it is declared, make sure to assign it a value before you attempt to use it. Accessing an uninitialized local variable will result in a compile-time error.


a few special escape sequences for char and String literals: \b (backspace), \t (tab), \n (line feed), \f (form feed), \r (carriage return), \" (double quote), \' (single quote), and \\ (backslash).

## Arrays
common methods can be found in **java.util.Arrays** class.

- Instead of using arraycopy(), can use copyOfRange():

```char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);```

Other useful methods in **java.util.Arrays**:
- binarySearch() - Searching an array for a specific value to get the index at which it is placed.
- equals - Comparing two arrays to determine if they are equal or not.
- fill() - Filling an array to place a specific value at each index.
- sort() & parallelSort(): Sorting an array into ascending order. Either sequentially (sort), or concurrently on multiprocessor systems (parallelSort).


## Summary
"fields" == "variables" in Java. **Instance variables (non-static fields)** are unique to each instance of a class. **Class variables (static fields)** are fields declared with the static modifier; there is exactly one copy of a class variable, regardless of how many times the class has been instantiated. Local variables store temporary state inside a method. Parameters are variables that provide extra information to a method; both local variables and parameters are always classified as "variables" (not "fields"). When naming your fields or variables, there are rules and conventions that you should (or must) follow.

The eight primitive data types are: byte, short, int, long, float, double, boolean, and char. The java.lang.String class represents character strings. The compiler will assign a reasonable default value for fields of the above types; for local variables, a default value is never assigned. A literal is the source code representation of a fixed value. An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed.