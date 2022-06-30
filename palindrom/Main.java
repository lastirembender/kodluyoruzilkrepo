import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int flag=0;
    System.out.println("Bir sayi giriniz: ");

    String x = input.nextLine();

    System.out.println(x);

    for(int i=0; i<=x.length(); i++){
      for(int j=x.length(); j<=0; j--){
        if(x.indexOf(i) != x.indexOf(j))
          flag=1;
        
      }
    }

    if(flag==1){
      System.out.println("Palindrom degil");
    }
    else{
      System.out.println("Palindrom");
    }
  
  }  
} 

