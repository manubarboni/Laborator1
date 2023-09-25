package Ex3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti ");
        int n = scanner.nextInt();
        boolean ok =true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {System.out.println(i+" ");
                ok=false;}
        }
        if(ok == true)
            System.out.println("Numarul este prim");

    }
}