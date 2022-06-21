import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int sonuc=1;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Bir taban sayı giriniz : ");
    int tabanSayi = scanner.nextInt();
    System.out.println("Bir sayı kuvveti giriniz : ");
    int sayiKuvveti = scanner.nextInt();

    for(int i=1; i<=sayiKuvveti; i++){
      sonuc *= tabanSayi;
    }

    System.out.println("Sonuc : "+sonuc);

    
		    
  }
}
        
