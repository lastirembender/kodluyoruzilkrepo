import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("1. sayiyi giriniz: ");
    int sayi1 = input.nextInt();
    System.out.println("2. sayiyi giriniz: ");
    int sayi2 = input.nextInt();

    int ebob=1, i=sayi1;
    while(i>=1){
      if(sayi1%i==0 && sayi2%i==0){
        ebob = i;
        break;
      }
      i--;
    }

    int ekok=(sayi1*sayi2)/ebob;

    System.out.println("EBOB: "+ ebob);
    System.out.println("EKOK: "+ ekok);
    

    
        
  }
}   
