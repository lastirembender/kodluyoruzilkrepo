import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int k, toplam=0, sayac=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Lütfen bir sayi giriniz: ");
    k = input.nextInt();

    for(int i=0; i<=k; i++){
      if(k%3==0 || k%4==0)
      {
        toplam += k;
        sayac += 1;
      }
    }
    System.out.println("Ortalama: "+(toplam/sayac));
		    
  }
}
        
