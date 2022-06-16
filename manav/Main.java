import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    double  armut, elma,domates,patlican,muz;
    double toplam;

    Scanner input = new Scanner(System.in);
    armut = input.nextInt();
    elma = input.nextInt();
    domates = input.nextInt();
    patlican = input.nextInt();
    muz = input.nextInt();

    toplam = 2.14*armut + 3.67*elma + 1.11*domates + 5*patlican + 0.95*muz;

    System.out.println("Toplam Fiyat= "+toplam);
    
    
    
    
  }
}