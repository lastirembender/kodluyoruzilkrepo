import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int km;
    double price;

    Scanner input = new Scanner(System.in);
    km = input.nextInt();

    price = 10+(km * 2.20);
    price = (price<20) ? 20 : price;

    System.out.println("Ucret= "+price);
    
    
  }
}