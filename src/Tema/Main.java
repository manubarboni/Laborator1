package Tema;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea dreptunghiului ");
        int lungime = scanner.nextInt();
        System.out.println("Introduceti latimea dreptunghiului ");
        int latime = scanner.nextInt();
        int perimetru = 2*latime+2*lungime;
        int arie = lungime*latime;
        System.out.println("Aria dreptunghiului: "+arie+"\nPerimetrul dreptunghiului: "+perimetru);
    }
}