import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int degree;
    
    degree = input.nextInt();
    
    if(degree<5)
      System.out.println("Kayak Yapabilirsiniz.");
    else if(degree>=5 && degree<15)
      System.out.println("Sinemaya gidebilirsiniz.");
    else if(degree>=15 && degree<25)
      System.out.println("Piknik yapmaya gidebilirsiniz.");
    else if(degree>25)
      System.out.println("Yüzmeye gidebilirsiniz.");
    else
      System.out.println("Yanlış değer girdiniz.")

  }
}
        
