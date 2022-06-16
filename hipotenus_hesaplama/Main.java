import java.util.Scanner; 
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int a,b;
    double hipotenus;

    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();

    hipotenus = Math.sqrt(a*a+b*b);

    System.out.println("Hipotenüs= "+hipotenus);
    
    
  }
}