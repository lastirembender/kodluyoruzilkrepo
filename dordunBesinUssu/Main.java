import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int k, dort=4, bes=5;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Lütfen bir sayi giriniz: ");
    k = input.nextInt();

    while(dort <= k && bes <=k){
      System.out.println("Dordun üssü: "+dort);
      System.out.println("Besin üssü: "+bes);

      dort *= 4;
      bes *= 5;
    }

    
		    
  }
}
        
