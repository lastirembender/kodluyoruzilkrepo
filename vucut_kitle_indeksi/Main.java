import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int kilo;
    double boy, vki;

    Scanner input = new Scanner(System.in);
    boy = input.nextDouble();
    kilo = input.nextInt();

    vki = kilo / (boy*boy);

    System.out.println("Vücut Kitle İndeksi= "+vki);
    
    
    
    
  }
}