public class Main {
    public static void main(String[] args) {

        int[] x = new int[5]; // 0 0 0 0 0

        /*
          0 1 2 3

    0     1 2 3 4
    1     5 6 8 9
    2     5 6 2 -1

         */
        // сначала - кол-во строк, потом кол-во столбцов
        int[][] y = new int[3][4];
        

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