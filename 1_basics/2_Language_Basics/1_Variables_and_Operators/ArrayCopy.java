/**
 * System class has arraycopy() method to copy data from one array to another
 * public static void arraycopy(Object src, int srcPos, 
 *                              Object dest, int destPos, int length)
 */
public class ArrayCopy {
  public static void main(String[] args){
    char[] copyFrom = {'h', 'e', 'l', 'l', 'o'};
    char[] copyTo = new char[7];
    System.arraycopy(copyFrom, 0, copyTo, 0, copyFrom.length);
    
    // what we want next is to print copyTo
    // need to first convert it into a String object using new String()
    System.out.println(new String(copyTo));
  }
}
