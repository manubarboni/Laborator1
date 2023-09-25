package Ex5;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       int[] array = {1,1,2,3,5,8,13,21};
        Random random = new Random();
        int a=random.nextInt(20);
        System.out.println(a);
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==a)
                System.out.println("Exista");
        }
    }
}
