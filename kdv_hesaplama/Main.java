import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    double cost, kdv, lastCost;
    double kdvPercent;

    Scanner input = new Scanner(System.in);
    cost = input.nextDouble();

    kdvPercent = (cost<=1000 && cost>=0) ? 0.18 : 0.8;
    kdv = cost*kdvPercent;
    lastCost = cost+kdv;

    System.out.println("KDV= "+kdv);
    System.out.println("KDV'li fiyat= "+lastCost);
    
  }
}