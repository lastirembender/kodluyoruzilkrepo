import java.util.Scanner;
public class Main {
    

    static int desenCikar(int sayi) {
        if (sayi <= 0) return sayi;
        System.out.print(sayi+" ");
        return desenCikar(sayi -5);
    }

    static int desenTopla(int cikarSayi, int sayi ) {
        if (cikarSayi > sayi) return cikarSayi;
        System.out.print(cikarSayi + " ");
        return desenTopla(cikarSayi + 5,sayi);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("N Sayisi:");
        int sayi=sc.nextInt();
        desenTopla(desenCikar(sayi),sayi);
    }


