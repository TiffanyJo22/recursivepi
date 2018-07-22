package recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Class to recursively calculate PI using the Nilakantha method
 * Each calculation brings closer approximation of pi
 * @author: Tiffany Stansfield
 * input: number of times to run calculation
 * output: approximate for pi
* */
public class RecursivePi {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long calculations;
        long STOP_CODE = 0;
        while (true)
            try {
                System.out.println("Enter number of calculations to approximate pi or 0 to exit: ");
                calculations = Long.parseLong(reader.readLine());
                if (calculations == STOP_CODE) {
                    break;
                } else {
                    piCalculation(calculations);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Entry");
            }
    }

    public static void piCalculation(long calcNumber) {
        double pi = 3;
        long j =2;
        double result;
        long step = 0;

        do {
            step++;
            if ((step % 2) == 1) {
                pi += 4.0 / (1.0 * j * (j + 1) * (j + 2));
            } else {
                pi -= 4.0 / (1.0 * j * (j + 1) * (j + 2));
            }
            j += 2;
            result = pi;
        } while (step < calcNumber);
        System.out.println("PI approximated with " + calcNumber + " calculations is " + result);
    }
}
