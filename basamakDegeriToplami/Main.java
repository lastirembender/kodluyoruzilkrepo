import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int sayi;
    int toplam=0;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Bir sayi giriniz : ");
    sayi = scanner.nextInt();

    int tempSayi = sayi;

    toplam += sayi%10;

    while (tempSayi != 0) {
      tempSayi /= 10;
      toplam += tempSayi%10;
    }

    System.out.println("Sonuc = "+toplam);

    
		    
  }
}
        
