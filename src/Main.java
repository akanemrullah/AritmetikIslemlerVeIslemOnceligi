import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Gerekli degiskenler tanimlandi.
        int a, b, c, sonuc;

        // Scanner nesnesi projemize dahil edildi.
        Scanner input = new Scanner(System.in);

        // Kullanicidan girdiler alinip bu veriler degiskenlere atandi.
        System.out.print("A sayisini giriniz:");
        a = input.nextInt();

        System.out.print("B sayisini giriniz:");
        b = input.nextInt();

        System.out.print("C sayisini giriniz:");
        c = input.nextInt();

        // Kullanici girdileri ile beraber islemler yapildi.
        sonuc = a + b * c - b;

        // Islemin sonucu kullanici ile paylasildi.
        System.out.println(sonuc);
    }
}