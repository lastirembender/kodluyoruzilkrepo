import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int sayi;
        double harm = 0;

        System.out.println("Sayi giriniz: ");
        sayi = input.nextInt();

        for (double i = 1; i <= sayi; i++){
            harm += (1.0/i);
        }

        System.out.println(harm);

    
		    
  }
}
        
