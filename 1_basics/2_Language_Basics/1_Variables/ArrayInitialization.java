class ArrayInitialization {
  public static void main(String[] args) {
    // declares an array of integers
    int[] arr1;

    // allocates memory for 10 integers
    arr1 = new int[10];

    // initialize arr1
    for (int i = 0; i < 10; i++) {
      arr1[i] = i * 100;
    }

    // another way of declaration and memory allocation
    int[] arr2 = new int[10];

    // third way of initializing an array
    int[] anArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

    // size of an array
    System.out.println(arr1.length);
  }
}