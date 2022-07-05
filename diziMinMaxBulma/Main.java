import java.util.Scanner;
import java.util.Arrays;

public class Main {
    
  public static void main(String[] args) {
    int[] array = {15,12,788,1,-1,-778,2,0};
    Arrays.sort(array);
    int max=array[array.length-1], min=0;

    System.out.println("Bir sayi giriniz: ");
    Scanner input = new Scanner(System.in);
    int x = input.nextInt();

    for(int i=0; i<=array.length; i++){
      if(array[i] > min && array[i] < x)
        min = array[i];
      else if(array[i] < max && array[i] > x)
        max = array[i];
      
    }

    System.out.println("Max: "+max);
    System.out.println("Min: "+min);
    
      

    


    }
}

