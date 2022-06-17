import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int x, y, secim;

    Scanner input = new Scanner(System.in);
    x = input.nextInt();
    y = input.nextInt();
    secim = input.nextInt();
    

    switch(secim){
      case 1:
        System.out.println("Toplam= "+ (x+y));
      case 2:
        System.out.println("Fark= "+ (x-y));
      case 3:
        System.out.println("Çarpım= "+ (x*y));
      case 4:
        System.out.println("Bolum= "+ (x/y));
        
    }

    
    
    
    
    
  }
}