import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{2, 3, 4}, {5, 6, 4}}; 
        System.out.println("Matris : ");
        for (int i = 0; i < a.length; i++) { 
            for (int j = 0; j < a[0].length; j++) { 
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("");
        }

        System.out.println("Transpoze :");
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i] + "  ");
            }
            System.out.println("");
        }
    }
}

