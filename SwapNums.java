import java.util.Scanner;

public class SwapNums {
    int m, n;

    public void swap(SwapNums swp) {
        int tmp = swp.m;
        swp.m = swp.n;
        swp.n = tmp;
    }

    public static void main(String[] args) {
        SwapNums objSwp = new SwapNums();

        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            objSwp.m = sc.nextInt();

            System.out.println("Enter the second number:");
            objSwp.n = sc.nextInt();

            objSwp.swap(objSwp);
            System.out.println("After swapping: m=" + objSwp.m + ", n=" + objSwp.n);   
            
            sc.close();
        }
        catch(Exception E){
            System.out.println("Exception: " + E.toString());
        }
    }
}