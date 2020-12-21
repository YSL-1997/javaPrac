/**
 * in terminal: 
 *    $ javac Bicycle.java BicycleDemo.java
 * will get two .class files: Bicycle.class & BicycleDemo.class
 *    $ java BicycleDemo
 * will run main() in BicycleDemo.java
 * this is because main() is in BicycleDemo.java, not in Bicycle.java
 */


class BicycleDemo {
  public static void main(String[] args) {

      // Create two different 
      // Bicycle objects
      Bicycle bike1 = new Bicycle();
      Bicycle bike2 = new Bicycle();

      // Invoke methods on 
      // those objects
      bike1.changeCadence(50);
      bike1.speedUp(10);
      bike1.changeGear(2);
      bike1.printStates();

      bike2.changeCadence(50);
      bike2.speedUp(10);
      bike2.changeGear(2);
      bike2.changeCadence(40);
      bike2.speedUp(10);
      bike2.changeGear(3);
      bike2.printStates();
  }
}