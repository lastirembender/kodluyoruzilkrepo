import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
    int math, phy, che, tur, hist, music;
    double score;

    Scanner l = new Scanner(System.in);

    math = l.nextInt();
    phy = l.nextInt();
    che = l.nextInt();
    tur = l.nextInt();
    hist = l.nextInt();
    music = l.nextInt();

    score = (math+phy+che+tur+hist+music)/6.0;

    String result = ((score>=60) ? "Sınıfı gecti" : "Sınıfı gecemedi");

    System.out.println(result);
    
  }
}