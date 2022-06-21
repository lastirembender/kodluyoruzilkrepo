import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int k, toplam=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Lütfen bir sayi giriniz: ");
    k = input.nextInt();

    while(k%2==1){
      if(k%2==0 || k%4==0){
        toplam+=k;
      }
      System.out.println(" Lütfen bir sayi giriniz: ");
      k = input.nextInt();
    }

    System.out.println("Toplam: "+toplam);
		    
  }
}
        
