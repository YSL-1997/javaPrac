public class AsciiVal{
  public static void main(String[] args){
    char ch = 'a';
    int asciiOfCh = ch;
    
    // cast char to int:
    int castAscii = (int)ch;

    System.out.println("ASCII val of " + ch + " is: "+ asciiOfCh);
    System.out.println("Cast " + ch + " into int is: "+ castAscii);
  }
}