import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");

        int sayi = scanner.nextInt();
        System.out.println(sayi + "! = " + faktoriyel(sayi));

        System.out.print("Bir sayı giriniz n = ");
        int n = scanner.nextInt();
        System.out.print("Bir sayı giriniz r = ");
        int r = scanner.nextInt();
        System.out.println("Kombinasyon  = " + (faktoriyel(n) / (faktoriyel(r) * faktoriyel(n - r))));
    }

    public static int faktoriyel (int sayi) {
        int toplam = 1;
        if (sayi > 0) {
            for (int i = 1; i <= sayi; i++) {
                toplam *= i;
            }
        }
        return toplam;
    }

    
		    
  }
}
        
