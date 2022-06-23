import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir sayi giriniz: ");
    int a=1,b=1,yedek;

    int x = input.nextInt();

    System.out.print(a + " "+ b);

    for(int i=3; i<=x; i++)
    {
      yedek = b;
      b = a+b;
      a = yedek;

      System.out.print(" "+b);  
    }

    
  }
    
} 

