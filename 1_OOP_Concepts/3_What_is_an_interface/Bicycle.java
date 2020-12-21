/**
 * an interface is a group of related methods with empty bodies
 * If your class (MyBicycle) claims to implement an interface (Bicycle), 
 * all methods defined by that interface (Bicycle) must appear in its 
 * source code before the class will successfully compile.
 * 
 * To actually compile the MyBicycle class, 
 * we need to add the public keyword to the beginning of 
 * the implemented interface methods, i.e. public methods in MyBicycle class
 */

/**
 * interface def of Bicycle
 */
interface Bicycle {
  // wheel revolutions/min
  void changeCadence(int val);

  void changeGear(int val);

  void speedUp(int inc);

  void applyBrakes(int dec);
}