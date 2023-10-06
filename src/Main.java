import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

             /*
          0 1 2 3 (j)
   (i)
    0     1(i=0,j=0) 2 3 4
    1     5 6 8 9
    2     5 6 2 -1

          Если кол-во строк = кол-во столбцов (матрица - квадратная)
          1 2 4
          3 4 5
          6 7 8
         */
        // сначала - кол-во строк (3), потом кол-во столбцов (4)
        //int[][] x = new int[3][4];

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] x = new int[n][m];
        for(int i=0;i<x.length;i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        print2D(x);
    }

    public static void print2D(int[][] y) {
        for(int i=0;i<y.length;i++) {
            for(int j=0;j<y[i].length;j++) {
                System.out.print(y[i][j]+" ");
            }
            System.out.println();
        }
    }
}