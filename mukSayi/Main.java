import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir sayi giriniz: ");
    int x = input.nextInt();
    int toplam=0;

    for(int i=1; i<=x; i++){
      if(x%i==0)
        toplam += i;
    }

    if(toplam==x)
      System.out.println(toplam+" Mükemmel sayidir.");
    else
      System.out.println(toplam+" Mükemmel sayi degildir.");
    
  }
}   
