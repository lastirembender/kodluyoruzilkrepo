import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    double total;
    double result = 0;
    for (int j : array) {
      result += 1.0 / j;
    }
    total= array.length / result;

    System.out.println("Harmonic Average = " + total);


    }
}

