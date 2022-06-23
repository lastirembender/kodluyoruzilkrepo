import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Bir sayi giriniz: ");
      

    int x = input.nextInt();
    for (int i=x; i >0 ; i--){

            for (int k=x-i; k>0; k--){
                System.out.print(" ");
            }

            for (int j=(2*i)-1; j>0; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
  }
}   
