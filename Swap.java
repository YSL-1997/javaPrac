// a Java program to demostrate that we can swap two objects
// Cited from: https://www.geeksforgeeks.org/swap-exchange-objects-java/

// a class called Car, with its field: carNumber
class Car{
    int no;
    
    Car(int no){
        this.no = no;
    }
}

class Main{
    public static void swap(Car c1, Car c2){
        int tmp = c1.no;
        c1.no = c2.no;
        c2.no = tmp;
    }

    public static void main(String[] args){
        Car c1 = new Car(1);
        Car c2 = new Car(2);
        swap(c1, c2);
    }
}