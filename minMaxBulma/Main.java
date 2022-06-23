import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Kaç sayi gireceginizi yaziniz: ");
    int x = input.nextInt();
    int min = 999, max=-999;

    for(int i=1; i<=x; i++){
      System.out.println(i+". sayiyi giriniz: ");
      int sayi=input.nextInt();
      
      if(sayi<=min)
        min = sayi;
        
      else if(sayi>=max)
        max = sayi;
    }
    
    System.out.println("En kucuk sayi:"+max);
    System.out.println("En kucuk sayi:"+min);
    
  }
}   
