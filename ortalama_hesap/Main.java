import java.util.Scanner; 

class Main {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, trk, kmy, fzk, mzk;

        System.out.println("Matematik:");
        mat = input.nextInt();
        System.out.println("Turkce:");
        trk = input.nextInt();
        System.out.println("Kimya:");
        kmy = input.nextInt();
        System.out.println("Fizik:");
        fzk = input.nextInt();
        System.out.println("Muzik:");
        mzk = input.nextInt();
        double avarage = (mat + kmy + trk + fzk + mzk) / 5;
        if ((0 <= mat && mat <=100) && (0 <= trk && trk <= 100) && (0 <= kmy && kmy <= 100) && (0 <= fzk && fzk <= 100) && (0 <= mzk && mzk <= 100)) {
            System.out.println("Degerler uygun aralikta.");
            if (avarage < 55)
                System.out.println("Kaldiniz");
            else
                System.out.println("Gectiniz");
        }
        else
        System.out.println("Notlariniz uygun aralikta degildir.");
        }
  }
        
