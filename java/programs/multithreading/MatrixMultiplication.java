package programs.multithreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatrixMultiplication extends Thread {
    static int[][] in1;
    static int[][] in2;
    static int[][] out;
    static int n = 2;
    int row;


    MatrixMultiplication(int i) {
        row = i;
        this.start();
    }

    public void run() {
        int i, j;
        for (i = 0; i < n; i++) {
            out[row][i] = 0;
            for (j = 0; j < n; j++)
                out[row][i] = out[row][i] + in1[row][j] * in2[j][i];
        }
    }

    public static void main(String[] args) {
        int i, j;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the order of Matrix : ");
        try {
            n = Integer.parseInt(br.readLine());
        } catch (Exception ignored) {
        }
        in1 = new int[n][n];
        in2 = new int[n][n];
        out = new int[n][n];
        System.out.println("Enter the First Matrix : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                try {
                    in1[i][j] = Integer.parseInt(br.readLine());
                } catch (Exception ignored) {
                }
            }
        }
        System.out.println("Enter the Second Matrix : ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                try {
                    in2[i][j] = Integer.parseInt(br.readLine());
                } catch (Exception ignored) {
                }
            }
        }
        MatrixMultiplication[] mat = new MatrixMultiplication[n];
        for (i = 0; i < n; i++)
            mat[i] = new MatrixMultiplication(i);
        try {
            for (i = 0; i < n; i++)
                mat[i].join();
        } catch (Exception ignored) {
        }
        System.out.println("OUTPUT :");
        for (i = 0; i < n; i++)
            for (j = 0; j < n; j++)
                System.out.println(out[i][j]);
    }
}
