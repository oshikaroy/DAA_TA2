import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int n = (int) Math.floor(Math.random() * (5) + 3);
        int matrix[][] = new int[n][n];
        System.out.println("Enter input for matrix of size " + n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter element at matrix[" + i + "][" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int z = 3; z < n; z++) {
            int i = 0;
            do {
                Matrix sb = new Matrix(z);
                Cycle cd1 = new Cycle(z);
                if (cd1.hamCycle(sb.getGraph(n, z, i, matrix)) == 1) {
                    flag = true;
                    System.out.println("Cycle between " + i + "-->" + (i + 1) % n + "-->" + (i + 2) % n + " exists");
                }
                i = (i + 1) % n;
            } while (i != 0);
        }
        if (!flag) {
            System.out.println("No cycle");
        }
        sc.close();
    }
}