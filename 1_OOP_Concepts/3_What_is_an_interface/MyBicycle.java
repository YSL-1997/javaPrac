/**
 * In MyBicycle class: to implement the interface definied in Bicycle.java, we
 * use implements keyword in the class declaration
 */

class MyBicycle implements Bicycle {
  int cadence = 0;
  int speed = 0;
  int gear = 1;

  // The compiler will now require that methods
  // changeCadence, changeGear, speedUp, and applyBrakes
  // all be implemented. Compilation will fail if those
  // methods are missing from this class.

  /**
   * To actually compile the MyBicycle class, we need to add the public keyword
   * to the beginning of the implemented interface methods, i.e. public methods 
   * in MyBicycle class
   */
  public void changeCadence(int newValue) {
    cadence = newValue;
  }

  public void changeGear(int newValue) {
    gear = newValue;
  }

  public void speedUp(int increment) {
    speed = speed + increment;
  }

  public void applyBrakes(int decrement) {
    speed = speed - decrement;
  }

  public void printStates() {
    System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
  }

  public static void main(String[] args) {
    MyBicycle b = new MyBicycle();
    b.printStates();
  }
}