import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int yaricap;
    double cevre, alan;

    Scanner input = new Scanner(System.in);
    yaricap = input.nextInt();

    cevre = Math.PI*yaricap*2;
    alan = Math.PI*yaricap*yaricap;

    System.out.println("Cevre= "+cevre);
    System.out.println("Alan= "+alan);
    
    
    
  }
}