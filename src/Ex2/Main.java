package Ex2;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String nume_fis= "in.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        String nume_fis_iesire = "out.txt";
        PrintStream flux_out = new PrintStream (nume_fis_iesire);
        int[] array = new int[6];
        for(int i=0; i<=5;i++) {
            int nr = Integer.parseInt(flux_in.readLine());
            array[i]=nr;
        }
        int suma=0;
        int min = array[0];
        int max = array[0];
        for(int i=0; i<=5;i++) {
           suma= suma+array[i];
           if(array[i]>max){
               max=array[i];
           }
           if(array[i]<min){
               min=array[i];
           }
        }
        float medie,count=6;
        medie=suma/count;
        flux_out.println(medie);
        flux_out.println(suma);
        flux_out.println(max);
        flux_out.println(min);
    }
}
