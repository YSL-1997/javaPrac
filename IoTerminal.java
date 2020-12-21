import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoTerminal {
  public static void main(String[] args) throws IOException {
    System.out.print("Enter a line of string: ");

    // enter data using BufferReader
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // read data using readLine
    String line = reader.readLine();

    // print the line
    System.out.println(line);

    reader.close();
  }
}