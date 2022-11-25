public class Matrix {
    int[][] mat;

    public Matrix(int size) {
        this.mat = new int[size][size];
    }

    public int[][] getGraph(int n, int z, int a, int[][] d) {
        for (int row = a, i = 0; i < z; i++, row = (row + 1) % n) {
            for (int j = 0, col = a; j < z; j++, col = (col + 1) % n) {
                mat[i][j] = d[row][col];
            }
        }
        return mat;

    }

}
