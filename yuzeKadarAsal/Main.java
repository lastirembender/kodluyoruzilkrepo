import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir sayi giriniz: ");
    int flag, i, j;

    int x = input.nextInt();
    for(i=2; i<=x; i++){
      flag=0;
      for(j=2; j<i; j++){
        if(i%j==0)
          flag=1;
      }
      if(flag==0)
        System.out.print(i+" ");
    }
  }
    
} 

