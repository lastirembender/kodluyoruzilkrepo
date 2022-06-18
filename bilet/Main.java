import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int yas, tip;
    double km, tutar;
    double yasIndirim, tipIndirim;
    double yasIndirimTutar, tutarYeni, tipIndirimTutar; 
    Scanner input = new Scanner(System.in);
    
    System.out.println("Gidilecek km sayısını yazınız : ");
    km = input.nextDouble();
    System.out.println("Yaşınızı giriniz : ");
    yas = input.nextInt();
    System.out.println("Yolculuk tipini seçiniz (Gidiş = 1 Gidiş-Dönüş = 2 ) : ");
    tip = input.nextInt();

    tutar = km * 0.10;

    if(yas<12)
      yasIndirim = 0.5;
    else if(yas>=12 && yas<=24)
      yasIndirim = 0.1;
    else if(yas>65)
      yasIndirim = 0.3;
    else 
      yasIndirim = 0;

    if(tip==2)
      tipIndirim = 0.2;
    else
      tipIndirim = 0;

    yasIndirimTutar = tutar * yasIndirim;
    tutarYeni = tutar - yasIndirimTutar;

    tipIndirimTutar = tutarYeni * tipIndirim;
    tutarYeni = tutarYeni - tipIndirimTutar;

    System.out.println("Toplam Tutar = " + tutarYeni);

        
  }
}
        
