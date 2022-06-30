import java.util.Scanner;

public class Main {
  static int result = 1;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Taban degerini giriniz :");
    int m = scan.nextInt();
    System.out.print("Us degerini giriniz :");
    int n = scan.nextInt();

    int sonuc = usAl(n,m);

    System.out.println("Sonuc: "+sonuc);

  }
  static int usAl(int x, int y){
        if (x == 0){
            return 1;
        }

        result *= y;
        usAl(x-1,y);
        return result;
    }
}

