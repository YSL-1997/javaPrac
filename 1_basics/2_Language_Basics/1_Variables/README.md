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