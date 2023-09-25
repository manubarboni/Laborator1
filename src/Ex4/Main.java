package Ex4;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
class GFG {
    // extended Euclidean Algorithm
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    // Driver code
    public static void main(String[] args)
    {
        Random random = new Random();
        int a=random.nextInt(30);
        int b = random.nextInt(30);
        int g = gcd(a, b);
        System.out.println("GCD(" + a + " , " + b
                + ") = " + g);
    }
}
