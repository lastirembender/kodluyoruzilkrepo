import java.util.Scanner;

public class Main {
  static int flag = 0;

  static boolean asalMi(int sayi, int i){
    if (sayi <= 2){
            return (sayi == 2) ? true : false;
        }

        if (sayi % i == 0){
            return false;
        }

        if (i * i > sayi){
            return true;
        }
        return asalMi(sayi, i + 1);
  }
        

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Taban degerini giriniz :");
    int m = scan.nextInt();

     if(asalMi(m,2)){
            System.out.println(m +" sayısı asal sayıdır. ");
        }else{
            System.out.println(m + " sayısı asal sayı değildir.");
        }

  }
  
}

