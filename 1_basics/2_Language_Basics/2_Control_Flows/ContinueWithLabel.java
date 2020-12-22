class ContinueWithLabel {
  public static void main(String[] args) {

    // searchMe is the string waiting to be searched
    String searchMe = "Look for a substring in me";

    // substring is the string that we want
    String substring = "sub";
    boolean foundIt = false;

    int max = searchMe.length() - substring.length();

    // define a label called "test" that used for labeled continue statement
    test: for (int i = 0; i <= max; i++) {
      int n = substring.length();
      int j = i;
      int k = 0;
      while (n-- != 0) {
        if (searchMe.charAt(j++) != substring.charAt(k++)) {
          continue test; // if not found, then continue to beginning of "test"
        }
      }
      foundIt = true;
      break test; // if found, then break the "test" loop
    }
    System.out.println(foundIt ? "Found it" : "Didn't find it");
  }
}
