class BreakWithLabel {
  public static void main(String[] args) {

    // initialize a 2D array, want to search for value 12
    int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };
    int searchfor = 12;

    int i;
    int j = 0;
    boolean foundIt = false;

    // "search" is a label that used to terminate an outer statement
    search: 
      for (i = 0; i < arrayOfInts.length; i++) {
        for (j = 0; j < arrayOfInts[i].length; j++) {
          if (arrayOfInts[i][j] == searchfor) {
            foundIt = true;
            break search; // break statement terminates the labeled statement
                          // i.e. break the nested for-loop
          }
        }
      }

      if (foundIt) {
        System.out.println("Found " + searchfor + " at " + i + ", " + j);
      } else {
        System.out.println(searchfor + " not in the array");
      }
  }
}
