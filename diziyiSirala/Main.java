import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Kac sayi gireceksiniz?: ");
    int dimension = input.nextInt();
    int[] arr = new int[dimension];
    
    for(int i=0; i<dimension; i++){
      System.out.println((i+1)+".sayiyi giriniz: ");
      arr[i] = input.nextInt();
    }
    
    Arrays.sort(arr);


    System.out.println(Arrays.toString(arr));
  }
}

