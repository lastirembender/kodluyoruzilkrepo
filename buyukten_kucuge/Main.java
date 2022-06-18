import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int degree;

    int sayi1, sayi2, sayi3;
        Scanner input=new Scanner(System.in);

        System.out.println("Üç Farklı Sayı Girinizi");

        sayi1=input.nextInt();
        sayi2=input.nextInt();
        sayi3=input.nextInt();

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 >sayi3) {
                System.out.println( sayi1 +" > " + sayi2 +" > "+ sayi3 );
            } else{
                System.out.println(sayi1 +" > " + sayi3+" > "+ sayi2);
            }
        } else if (sayi2 > sayi1 && sayi2> sayi3) {
            if (sayi1 > sayi3) {
                System.out.println(sayi2 + " > " + sayi1 + " > " + sayi3);
            } else {
                System.out.println(sayi2 + " > " + sayi3 + " > " + sayi1);
            }
        }else{
            if (sayi1 > sayi2) {
                System.out.println(sayi3 + " > " + sayi1 + " > " + sayi2);
            } else {
                System.out.println(sayi3 + " > " + sayi2 + " > " + sayi1);
            }
        }

  }
}
        
