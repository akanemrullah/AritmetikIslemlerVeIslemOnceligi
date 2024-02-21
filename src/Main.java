import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("A sayisini giriniz:");
        a = input.nextInt();

        System.out.print("B sayisini giriniz:");
        b = input.nextInt();

        System.out.print("C sayisini giriniz:");
        c = input.nextInt();

        sonuc = a + b * c - b;

        System.out.println(sonuc);
    }
}