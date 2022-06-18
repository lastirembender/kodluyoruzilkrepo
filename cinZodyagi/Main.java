import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int dogumYili, kalan;
    String mesaj="";

    Scanner sc = new Scanner(System.in);

    System.out.print("Doğum Yılınızı Giriniz: ");
    dogumYili = sc.nextInt();

    kalan = dogumYili % 12;
    if(kalan == 0) 
      mesaj="Maymun";
    else if(kalan == 1)
      mesaj="Horoz";
    else if(kalan==2)
      mesaj="Köpek";
    else if(kalan==3)
      mesaj="Domuz";
    else if(kalan==4)
      mesaj="Fare";
    else if(kalan==5)
      mesaj="Öküz";
    else if(kalan==6)
      mesaj="Kaplan";
    else if(kalan==7)
      mesaj="Tavşan";
    else if(kalan==8)
      mesaj="Ejderha";
    else if(kalan==9)
      mesaj="Yılan";
    else if(kalan==10)
      mesaj="At";
    else if(kalan==11)
      mesaj="Koyun";
        
    System.out.println("Çin Zodyağı Burcunuz: " +mesaj);


        
  }
}
        
